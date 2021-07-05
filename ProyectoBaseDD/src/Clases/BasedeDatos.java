package Clases;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BasedeDatos
{

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    CallableStatement cst = null;

    public BasedeDatos()
    {
        try
        {
            Class.forName("oracle.jdbc.OracleDriver");
        } catch (ClassNotFoundException ex)
        {
            System.out.println(ex.toString());
        }
    }

    public void insertarEmpleados(EmpleadosC empleado)
    {
        try
        {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pablo", "pablo");

            String sql = "INSERT INTO empleados (idempleado, nombre, apellido_p, apellido_m, puesto, telefono, direccion, salario)"
                    + "values(?,?,?,?,?,?,?,?)";
            pst = con.prepareStatement(sql);

            pst.setInt(1, empleado.getIdEmpleado());
            pst.setString(2, empleado.getNombre());
            pst.setString(3, empleado.getApellidope());
            pst.setString(4, empleado.getApellidome());
            pst.setString(5, empleado.getPuesto());
            pst.setString(6, empleado.getTelefono());
            pst.setString(7, empleado.getDireccion());
            pst.setInt(8, empleado.getSalario());

            pst.executeUpdate();

        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        } finally
        {
            try
            {
                pst.close();
                con.close();
            } catch (SQLException ex)
            {
                System.out.println(ex.toString());
            }
        }
    }

    public void insertarClientes(ClientesC cliente)
    {
        try
        {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pablo", "pablo");

            String sql = "INSERT INTO clientes (idcliente, nombre, apellido_p, apellido_m, rfc, telefono, email)"
                    + "values(?,?,?,?,?,?,?)";
            pst = con.prepareStatement(sql);

            pst.setInt(1, cliente.getIdCliente());
            pst.setString(2, cliente.getNombrec());
            pst.setString(3, cliente.getApellidopc());
            pst.setString(4, cliente.getApellidomc());
            pst.setString(5, cliente.getRFC());
            pst.setString(6, cliente.getTelefono());
            pst.setString(7, cliente.getEmail());

            pst.executeUpdate();

        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        } finally
        {
            try
            {
                pst.close();
                con.close();
            } catch (SQLException ex)
            {
                System.out.println(ex.toString());
            }
        }
    }

    public void insertarDepartamentos(DepartamentosC departamento)
    {
        try
        {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pablo", "pablo");

            String sql = "INSERT INTO departamento (iddepartamento, nombre_dep, pasillo, rack)"
                    + "values(?,?,?,?)";
            pst = con.prepareStatement(sql);

            pst.setInt(1, departamento.getIdDepartamento());
            pst.setString(2, departamento.getNombreDep());
            pst.setInt(3, departamento.getPasillo());
            pst.setInt(4, departamento.getRack());

            pst.executeUpdate();

        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        } finally
        {
            try
            {
                pst.close();
                con.close();
            } catch (SQLException ex)
            {
                System.out.println(ex.toString());
            }
        }
    }

    public void insertarProveedores(ProveedoresC proveedor)
    {
        try
        {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pablo", "pablo");

            String sql = "INSERT INTO proveedores (idproveedor, telefono, direccion, nombre)"
                    + "values(?,?,?,?)";
            pst = con.prepareStatement(sql);

            pst.setInt(1, proveedor.getIdProveedor());
            pst.setString(2, proveedor.getTelefono());
            pst.setString(3, proveedor.getDireccion());
            pst.setString(4, proveedor.getNombreProv());

            pst.executeUpdate();

        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        } finally
        {
            try
            {
                pst.close();
                con.close();
            } catch (SQLException ex)
            {
                System.out.println(ex.toString());
            }
        }
    }

    public void insertarEntregas(EntregasC entrega)
    {
        try
        {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pablo", "pablo");

            String sql = "INSERT INTO entregas (idproducto, idproveedor, cantidad, fecha)"
                    + "values(?,?,?,?)";
            pst = con.prepareStatement(sql);

            pst.setInt(1, entrega.getIdProducto());
            pst.setInt(2, entrega.getIdProveedor());
            pst.setInt(3, entrega.getCantidad());
            pst.setDate(4, entrega.getFecha());

            pst.executeUpdate();

        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        } finally
        {
            try
            {
                pst.close();
                con.close();
            } catch (SQLException ex)
            {
                System.out.println(ex.toString());
            }
        }
    }

    public void insertarAlmacen(AlmacenC a)
    {
        try
        {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pablo", "pablo");

            String sql = "INSERT INTO almacen (idproducto, iddepartamento, nombre_producto, descripcion, existencia, precio)"
                    + "values(?,?,?,?,?,?)";
            pst = con.prepareStatement(sql);

            pst.setInt(1, a.getIdProducto());
            pst.setInt(2, a.getIdDepartamento());
            pst.setString(3, a.getNombre());
            pst.setString(4, a.getDescripcion());
            pst.setInt(5, a.getExistencia());
            pst.setDouble(6, a.getPrecio());

            pst.executeUpdate();

        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        } finally
        {
            try
            {
                pst.close();
                con.close();
            } catch (SQLException ex)
            {
                System.out.println(ex.toString());
            }
        }
    }

    public void insertarVentas(VentasC v)
    {
        try
        {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pablo", "pablo");

            String sql = "INSERT INTO ventas (idventa, idcliente, idempleado, subtotal, iva, fecha)"
                    + "values(?,?,?,?,0.16,?)";
            pst = con.prepareStatement(sql);

            pst.setInt(1, v.getIdVenta());
            pst.setInt(2, v.getIdCliente());
            pst.setInt(3, v.getIdEmpleado());
            pst.setDouble(4, v.getSubtotal());
            pst.setString(5, v.getFecha());

            pst.executeUpdate();

        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        } finally
        {
            try
            {
                pst.close();
                con.close();
            } catch (SQLException ex)
            {
                System.out.println(ex.toString());
            }
        }
    }

//    public void insertarDetalleVenta(DetalleVentaC dv) {
//        try {
//            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pablo", "pablo");
//
//            String sql = "INSERT INTO detalleventa (idproducto, idventa, cantidad, total)"
//                    + "values(?,?,?,?)";
//            pst = con.prepareStatement(sql);
//
//            pst.setInt(1, dv.getIdProducto());
//            pst.setInt(2, dv.getIdVenta());
//            pst.setInt(3, dv.getCantidad());
//            pst.setDouble(4, dv.getTotal());
//
//            pst.executeUpdate();
//
//        } catch (SQLException ex) {
//            System.out.println(ex.toString());
//        } finally {
//            try {
//                pst.close();
//                con.close();
//            } catch (SQLException ex) {
//                System.out.println(ex.toString());
//            }
//        }
//    }
    public void insertarDetalleVenta(DetalleVentaC dv)
    {
        try
        {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pablo", "pablo");

            cst = con.prepareCall("{call insertardetalle(?,?,?,?)}");

            cst.setInt(1, dv.getIdProducto());
            cst.setInt(2, dv.getIdVenta());
            cst.setInt(3, dv.getCantidad());
            cst.setDouble(4, dv.getTotal());

            cst.execute();

        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        } finally
        {
            try
            {
                pst.close();
                con.close();
            } catch (SQLException ex)
            {
                System.out.println(ex.toString());
            }
        }
    }

    public void insertarTarjetaPuntos(TarjetaPuntosC t)
    {
        try
        {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pablo", "pablo");

            String sql = "INSERT INTO tarjetapuntos (idtarjeta, idcliente, idventa, numerotarjeta, vencimientopuntos, totalpuntos)"
                    + "values(?,?,?,?,?,?)";
            pst = con.prepareStatement(sql);

            pst.setInt(1, t.getIdTarjeta());
            pst.setInt(2, t.getIdCliente());
            pst.setInt(3, t.getIdVenta());
            pst.setString(4, t.getNumeroTarjeta());
            pst.setString(5, t.getVencimientoPuntos().toString());
            pst.setInt(6, t.getTotalPuntos());

            pst.executeUpdate();

        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        } finally
        {
            try
            {
                pst.close();
                con.close();
            } catch (SQLException ex)
            {
                System.out.println(ex.toString());
            }
        }
    }

    public int insertarApartados(ApartadosC a)
    {
        int res = 0;
        try
        {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pablo", "pablo");

            cst = con.prepareCall("{? = call checarapar(?,?,?,?,?,?,?)}");

            cst.registerOutParameter(1, Types.NUMERIC);

            cst.setInt(2, a.getIdApartado());
            cst.setInt(3, a.getIdCliente());
            cst.setInt(4, a.getIdProducto());
            cst.setString(5, a.getDescripcion());
            cst.setInt(6, a.getCantidad());
            cst.setInt(7, a.getAdelanto());
            cst.setString(8, a.getVencimientoPago());

            cst.execute();

            res = cst.getInt(1);

        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        } finally
        {
            try
            {
                pst.close();
                con.close();
            } catch (SQLException ex)
            {
                System.out.println(ex.toString());
            }
        }
        return res;
    }

//    public void insertarApartados(ApartadosC a) {
//        try {
//            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pablo", "pablo");
//
//            String sql = "INSERT INTO apartados (idapartado, idcliente, idproducto, descripcion, cantidad, adelanto, vencimientopago)"
//                    + "values(?,?,?,?,?,?,?)";
//            pst = con.prepareStatement(sql);
//
//            pst.setInt(1, a.getIdApartado());
//            pst.setInt(2, a.getIdCliente());
//            pst.setInt(3, a.getIdProducto());
//            pst.setString(4, a.getDescripcion());
//            pst.setInt(5, a.getCantidad());
//            pst.setInt(6, a.getAdelanto());
//            pst.setString(7, a.getVencimientoPago());
//
//            pst.executeUpdate();
//
//        } catch (SQLException ex) {
//            System.out.println(ex.toString());
//        } finally {
//            try {
//                pst.close();
//                con.close();
//            } catch (SQLException ex) {
//                System.out.println(ex.toString());
//            }
//        }
//    }
    public ArrayList<ClientesC> consultarClientes()
    {
        ArrayList<ClientesC> listaClientes = new ArrayList<>();
        try
        {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pablo", "pablo");

            String sql = "SELECT *"
                    + "FROM clientes "
                    + "ORDER BY idcliente";
            pst = con.prepareStatement(sql);

            rs = pst.executeQuery();

            while (rs.next())
            {
                int id = rs.getInt("idcliente");
                String nombre = rs.getString("nombre");
                String apeP = rs.getString("apellido_p");
                String apeM = rs.getString("apellido_m");
                String rfc = rs.getString("rfc");
                String telefono = rs.getString("telefono");
                String email = rs.getString("email");

                ClientesC c = new ClientesC(id, nombre, apeP, apeM, rfc, telefono, email);

                listaClientes.add(c);
            }

        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        } finally
        {
            try
            {
                pst.close();
                con.close();
            } catch (SQLException ex)
            {
                System.out.println(ex.toString());
            }
        }
        return listaClientes;
    }

    public ArrayList<DepartamentosC> consultarDepartamentos()
    {
        ArrayList<DepartamentosC> listaDepartamentos = new ArrayList<>();
        try
        {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pablo", "pablo");

            String sql = "SELECT *"
                    + "FROM departamento "
                    + "ORDER BY iddepartamento";
            pst = con.prepareStatement(sql);

            rs = pst.executeQuery();

            while (rs.next())
            {
                int id = rs.getInt("iddepartamento");
                String nombre = rs.getString("nombre_dep");
                int pasillo = rs.getInt("pasillo");
                int rack = rs.getInt("rack");

                DepartamentosC d = new DepartamentosC(id, nombre, pasillo, rack);

                listaDepartamentos.add(d);
            }

        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        } finally
        {
            try
            {
                pst.close();
                con.close();
            } catch (SQLException ex)
            {
                System.out.println(ex.toString());
            }
        }
        return listaDepartamentos;

    }

    public ArrayList<EmpleadosC> consultarEmpleados()
    {
        ArrayList<EmpleadosC> listaEmpleados = new ArrayList<>();
        try
        {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pablo", "pablo");

            String sql = "SELECT *"
                    + "FROM empleados "
                    + "ORDER BY idempleado";
            pst = con.prepareStatement(sql);

            rs = pst.executeQuery();

            while (rs.next())
            {
                int id = rs.getInt("idempleado");
                String nombre = rs.getString("nombre");
                String apeP = rs.getString("apellido_p");
                String apeM = rs.getString("apellido_m");
                String puesto = rs.getString("puesto");
                String telefono = rs.getString("telefono");
                String direccion = rs.getString("direccion");
                int salario = rs.getInt("salario");

                EmpleadosC e = new EmpleadosC(id, nombre, apeP, apeM, puesto, telefono, direccion, salario);

                listaEmpleados.add(e);
            }

        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        } finally
        {
            try
            {
                pst.close();
                con.close();
            } catch (SQLException ex)
            {
                System.out.println(ex.toString());
            }
        }
        return listaEmpleados;
    }

    public ArrayList<ProveedoresC> consultarProveedores()
    {
        ArrayList<ProveedoresC> listaProveedores = new ArrayList<>();
        try
        {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pablo", "pablo");

            String sql = "SELECT *"
                    + "FROM proveedores "
                    + "ORDER BY idproveedor";
            pst = con.prepareStatement(sql);

            rs = pst.executeQuery();

            while (rs.next())
            {
                int id = rs.getInt("idproveedor");
                String telefono = rs.getString("telefono");
                String direccion = rs.getString("direccion");
                String nombre = rs.getString("nombre");

                ProveedoresC d = new ProveedoresC(id, telefono, direccion, nombre);

                listaProveedores.add(d);
            }

        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        } finally
        {
            try
            {
                pst.close();
                con.close();
            } catch (SQLException ex)
            {
                System.out.println(ex.toString());
            }
        }
        return listaProveedores;
    }

    public ArrayList<EntregasC> consultarEntregas()
    {
        ArrayList<EntregasC> listaEntregas = new ArrayList<>();
        try
        {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pablo", "pablo");

            String sql = "SELECT *"
                    + "FROM entregas "
                    + "ORDER BY idproducto";
            pst = con.prepareStatement(sql);

            rs = pst.executeQuery();

            while (rs.next())
            {
                int id1 = rs.getInt("idproducto");
                int id2 = rs.getInt("idproveedor");
                int cantidad = rs.getInt("cantidad");
                Date fecha = rs.getDate("fecha");

                EntregasC en = new EntregasC(id1, id2, cantidad, fecha);

                listaEntregas.add(en);
            }

        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        } finally
        {
            try
            {
                pst.close();
                con.close();
            } catch (SQLException ex)
            {
                System.out.println(ex.toString());
            }
        }
        return listaEntregas;
    }

    public ArrayList<AlmacenC> consultarProductos()
    {
        ArrayList<AlmacenC> listaProductos = new ArrayList<>();
        try
        {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pablo", "pablo");

            String sql = "SELECT *"
                    + "FROM almacen "
                    + "ORDER BY idproducto";
            pst = con.prepareStatement(sql);

            rs = pst.executeQuery();

            while (rs.next())
            {
                int id1 = rs.getInt("idproducto");
                int id2 = rs.getInt("iddepartamento");
                String nombre = rs.getString("nombre_producto");
                String descripcion = rs.getString("descripcion");
                int existencia = rs.getInt("existencia");
                double precio = rs.getDouble("precio");

                AlmacenC prod = new AlmacenC(id1, id2, nombre, descripcion, existencia, precio);

                listaProductos.add(prod);
            }

        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        } finally
        {
            try
            {
                pst.close();
                con.close();
            } catch (SQLException ex)
            {
                System.out.println(ex.toString());
            }
        }
        return listaProductos;
    }

    public ArrayList<VentasC> consultarVentas()
    {
        ArrayList<VentasC> listaVentas = new ArrayList<>();
        try
        {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pablo", "pablo");

            String sql = "SELECT *"
                    + "FROM ventas "
                    + "ORDER BY idventa";
            pst = con.prepareStatement(sql);

            rs = pst.executeQuery();

            while (rs.next())
            {
                int id1 = rs.getInt("idventa");
                int id2 = rs.getInt("idcliente");
                int id3 = rs.getInt("idempleado");
                double subtotal = rs.getDouble("subtotal");
                Date fecha = rs.getDate("fecha");

                VentasC ven = new VentasC(id1, id2, id3, subtotal, fecha.toString());

                listaVentas.add(ven);
            }

        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        } finally
        {
            try
            {
                pst.close();
                con.close();
            } catch (SQLException ex)
            {
                System.out.println(ex.toString());
            }
        }
        return listaVentas;
    }

    public ArrayList<DetalleVentaC> consultarDetalleVenta()
    {
        ArrayList<DetalleVentaC> listaDetalle = new ArrayList<>();
        try
        {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pablo", "pablo");

            String sql = "SELECT *"
                    + "FROM detalleventa "
                    + "ORDER BY idproducto";
            pst = con.prepareStatement(sql);

            rs = pst.executeQuery();

            while (rs.next())
            {
                int id1 = rs.getInt("idproducto");
                int id2 = rs.getInt("idventa");
                int cantidad = rs.getInt("cantidad");
                double total = rs.getDouble("total");

                DetalleVentaC det = new DetalleVentaC(id1, id2, cantidad, total);

                listaDetalle.add(det);
            }

        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        } finally
        {
            try
            {
                pst.close();
                con.close();
            } catch (SQLException ex)
            {
                System.out.println(ex.toString());
            }
        }
        return listaDetalle;
    }

    public ArrayList<TarjetaPuntosC> consultarTarjeta()
    {
        ArrayList<TarjetaPuntosC> listaTarjeta = new ArrayList<>();
        try
        {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pablo", "pablo");

            String sql = "SELECT *"
                    + "FROM tarjetapuntos "
                    + "ORDER BY idtarjeta";
            pst = con.prepareStatement(sql);

            rs = pst.executeQuery();

            while (rs.next())
            {
                int id1 = rs.getInt("idtarjeta");
                int id2 = rs.getInt("idcliente");
                int id3 = rs.getInt("idventa");
                String numeroTrajeta = rs.getString("numerotarjeta");
                Date vencimiento = rs.getDate("vencimientopuntos");
                int totalP = rs.getInt("totalpuntos");

                TarjetaPuntosC det = new TarjetaPuntosC(id1, id2, id3, numeroTrajeta, vencimiento, totalP);

                listaTarjeta.add(det);
            }

        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        } finally
        {
            try
            {
                pst.close();
                con.close();
            } catch (SQLException ex)
            {
                System.out.println(ex.toString());
            }
        }
        return listaTarjeta;
    }

    public ArrayList<ApartadosC> consultarApartados()
    {
        ArrayList<ApartadosC> listaApartados = new ArrayList<>();
        try
        {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pablo", "pablo");

            String sql = "SELECT *"
                    + "FROM apartados "
                    + "ORDER BY idapartado";
            pst = con.prepareStatement(sql);

            rs = pst.executeQuery();

            while (rs.next())
            {
                int id1 = rs.getInt("idapartado");
                int id2 = rs.getInt("idcliente");
                int id3 = rs.getInt("idproducto");
                String descripcion = rs.getString("descripcion");
                int cantidad = rs.getInt("cantidad");
                int adelanto = rs.getInt("adelanto");
                String vencimientoPago = rs.getString("vencimientopago");

                ApartadosC det = new ApartadosC(id1, id2, id3, descripcion, cantidad, adelanto, vencimientoPago);

                listaApartados.add(det);
            }

        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        } finally
        {
            try
            {
                pst.close();
                con.close();
            } catch (SQLException ex)
            {
                System.out.println(ex.toString());
            }
        }
        return listaApartados;
    }

    public ArrayList<ClientesC> buscarClientes(String criterio)
    {
        ArrayList<ClientesC> listaClientes = new ArrayList<>();
        try
        {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pablo", "pablo");

            String sql = "SELECT * "
                    + "FROM clientes "
                    + "WHERE idcliente LIKE '" + criterio + "%'"
                    + "OR nombre LIKE '%" + criterio + "%'"
                    + "ORDER BY idcliente";

            pst = con.prepareStatement(sql);

            rs = pst.executeQuery();

            while (rs.next())
            {
                int id = rs.getInt("idcliente");
                String nombre = rs.getString("nombre");
                String apeP = rs.getString("apellido_p");
                String apeM = rs.getString("apellido_m");
                String rfc = rs.getString("rfc");
                String telefono = rs.getString("telefono");
                String email = rs.getString("email");

                ClientesC c = new ClientesC(id, nombre, apeP, apeM, rfc, telefono, email);

                listaClientes.add(c);
            }

        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        } finally
        {
            try
            {
                pst.close();
                con.close();
            } catch (SQLException ex)
            {
                System.out.println(ex.toString());
            }
        }
        return listaClientes;
    }

    public ArrayList<DepartamentosC> buscarDepartamentos(String criterio)
    {
        ArrayList<DepartamentosC> listaDepartamentos = new ArrayList<>();
        try
        {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pablo", "pablo");

            String sql = "SELECT *"
                    + "FROM departamento "
                    + "WHERE iddepartamento LIKE '" + criterio + "%'"
                    + "OR nombre_dep LIKE '%" + criterio + "%'"
                    + "ORDER BY iddepartamento";

            pst = con.prepareStatement(sql);

            rs = pst.executeQuery();

            while (rs.next())
            {
                int id = rs.getInt("iddepartamento");
                String nombre = rs.getString("nombre_dep");
                int pasillo = rs.getInt("pasillo");
                int rack = rs.getInt("rack");

                DepartamentosC d = new DepartamentosC(id, nombre, pasillo, rack);

                listaDepartamentos.add(d);
            }

        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        } finally
        {
            try
            {
                pst.close();
                con.close();
            } catch (SQLException ex)
            {
                System.out.println(ex.toString());
            }
        }
        return listaDepartamentos;
    }

    public ArrayList<EmpleadosC> buscarEmpleados(String criterio)
    {
        ArrayList<EmpleadosC> listaEmpleados = new ArrayList<>();
        try
        {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pablo", "pablo");

            String sql = "SELECT *"
                    + "FROM empleados "
                    + "WHERE idempleado LIKE '" + criterio + "%'"
                    + "OR nombre LIKE '%" + criterio + "%'"
                    + "ORDER BY idempleado";
            pst = con.prepareStatement(sql);

            rs = pst.executeQuery();

            while (rs.next())
            {
                int id = rs.getInt("idempleado");
                String nombre = rs.getString("nombre");
                String apeP = rs.getString("apellido_p");
                String apeM = rs.getString("apellido_m");
                String puesto = rs.getString("puesto");
                String telefono = rs.getString("telefono");
                String direccion = rs.getString("direccion");
                int salario = rs.getInt("salario");

                EmpleadosC e = new EmpleadosC(id, nombre, apeP, apeM, puesto, telefono, direccion, salario);

                listaEmpleados.add(e);
            }

        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        } finally
        {
            try
            {
                pst.close();
                con.close();
            } catch (SQLException ex)
            {
                System.out.println(ex.toString());
            }
        }
        return listaEmpleados;
    }

    public ArrayList<ProveedoresC> buscarProveedores(String criterio)
    {
        ArrayList<ProveedoresC> listaProveedores = new ArrayList<>();
        try
        {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pablo", "pablo");

            String sql = "SELECT *"
                    + "FROM proveedores "
                    + "WHERE idproveedor LIKE '" + criterio + "%'"
                    + "OR nombre LIKE '%" + criterio + "%'"
                    + "ORDER BY idproveedor";

            pst = con.prepareStatement(sql);

            rs = pst.executeQuery();

            while (rs.next())
            {
                int id = rs.getInt("idproveedor");
                String telefono = rs.getString("telefono");
                String direccion = rs.getString("direccion");
                String nombre = rs.getString("nombre");

                ProveedoresC d = new ProveedoresC(id, telefono, direccion, nombre);

                listaProveedores.add(d);
            }

        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        } finally
        {
            try
            {
                pst.close();
                con.close();
            } catch (SQLException ex)
            {
                System.out.println(ex.toString());
            }
        }
        return listaProveedores;
    }

    public ArrayList<EntregasC> buscarEntregas(String criterio)
    {
        ArrayList<EntregasC> listaEntregas = new ArrayList<>();
        try
        {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pablo", "pablo");

            String sql = "SELECT *"
                    + "FROM entregas "
                    + "WHERE idproducto LIKE '" + criterio + "%'"
                    // + "OR nombre LIKE '%" + criterio + "%'"
                    + "ORDER BY idproducto";

            pst = con.prepareStatement(sql);

            rs = pst.executeQuery();

            while (rs.next())
            {
                int id1 = rs.getInt("idproducto");
                int id2 = rs.getInt("idproveedor");
                int cantidad = rs.getInt("cantidad");
                Date fecha = rs.getDate("fecha");

                EntregasC en = new EntregasC(id1, id2, cantidad, fecha);

                listaEntregas.add(en);
            }

        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        } finally
        {
            try
            {
                pst.close();
                con.close();
            } catch (SQLException ex)
            {
                System.out.println(ex.toString());
            }
        }
        return listaEntregas;
    }

    public ArrayList<AlmacenC> buscarProductos(String criterio)
    {
        ArrayList<AlmacenC> listaProductos = new ArrayList<>();
        try
        {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pablo", "pablo");

            String sql = "SELECT *"
                    + "FROM almacen "
                    + "WHERE idproducto LIKE '" + criterio + "%'"
                    + "OR nombre_producto LIKE '" + criterio + "%'"
                    + "ORDER BY idproducto";
            pst = con.prepareStatement(sql);

            rs = pst.executeQuery();

            while (rs.next())
            {
                int id1 = rs.getInt("idproducto");
                int id2 = rs.getInt("iddepartamento");
                String nombre = rs.getString("nombre_producto");
                String descripcion = rs.getString("descripcion");
                int existencia = rs.getInt("existencia");
                double precio = rs.getDouble("precio");

                AlmacenC prod = new AlmacenC(id1, id2, nombre, descripcion, existencia, precio);

                listaProductos.add(prod);
            }

        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        } finally
        {
            try
            {
                pst.close();
                con.close();
            } catch (SQLException ex)
            {
                System.out.println(ex.toString());
            }
        }
        return listaProductos;
    }

    public ArrayList<VentasC> buscarVentas(String criterio)
    {
        ArrayList<VentasC> listaVentas = new ArrayList<>();
        try
        {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pablo", "pablo");

            String sql = "SELECT *"
                    + "FROM ventas "
                    + "WHERE idventa LIKE '" + criterio + "%'"
                    + "ORDER BY idventa";
            pst = con.prepareStatement(sql);

            rs = pst.executeQuery();

            while (rs.next())
            {
                int id1 = rs.getInt("idventa");
                int id2 = rs.getInt("idcliente");
                int id3 = rs.getInt("idempleado");
                double subtotal = rs.getDouble("subtotal");
                Date fecha = rs.getDate("fecha");

                VentasC ven = new VentasC(id1, id2, id3, subtotal, fecha.toString());

                listaVentas.add(ven);
            }

        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        } finally
        {
            try
            {
                pst.close();
                con.close();
            } catch (SQLException ex)
            {
                System.out.println(ex.toString());
            }
        }
        return listaVentas;
    }

    public ArrayList<DetalleVentaC> buscarDetalleVenta(String criterio)
    {
        ArrayList<DetalleVentaC> listaDetalle = new ArrayList<>();
        try
        {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pablo", "pablo");

            String sql = "SELECT *"
                    + "FROM detalleventa "
                    + "WHERE idproducto LIKE '" + criterio + "%'"
                    + "OR idventa LIKE '" + criterio + "%'"
                    + "ORDER BY idproducto";
            pst = con.prepareStatement(sql);

            rs = pst.executeQuery();

            while (rs.next())
            {
                int id1 = rs.getInt("idproducto");
                int id2 = rs.getInt("idventa");
                int cantidad = rs.getInt("cantidad");
                double total = rs.getDouble("total");

                DetalleVentaC det = new DetalleVentaC(id1, id2, cantidad, total);

                listaDetalle.add(det);
            }

        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        } finally
        {
            try
            {
                pst.close();
                con.close();
            } catch (SQLException ex)
            {
                System.out.println(ex.toString());
            }
        }
        return listaDetalle;
    }

    public ArrayList<TarjetaPuntosC> buscarTarjeta(String criterio)
    {
        ArrayList<TarjetaPuntosC> listaTarjeta = new ArrayList<>();
        try
        {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pablo", "pablo");

            String sql = "SELECT *"
                    + "FROM tarjetapuntos "
                    + "WHERE idtarjeta LIKE '" + criterio + "%'"
                    + "ORDER BY idtarjeta";
            pst = con.prepareStatement(sql);

            rs = pst.executeQuery();

            while (rs.next())
            {
                int id1 = rs.getInt("idtarjeta");
                int id2 = rs.getInt("idcliente");
                int id3 = rs.getInt("idventa");
                String numeroTrajeta = rs.getString("numerotarjeta");
                String vencimiento = rs.getString("vencimientopuntos");
                java.util.Date fechv = new SimpleDateFormat("dd/MM/yy").parse(vencimiento);
                int totalP = rs.getInt("totalpuntos");

                TarjetaPuntosC det = new TarjetaPuntosC(id1, id2, id3, numeroTrajeta, (Date) fechv, totalP);

                listaTarjeta.add(det);
            }

        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        } catch (ParseException ex)
        {
            Logger.getLogger(BasedeDatos.class.getName()).log(Level.SEVERE, null, ex);
        } finally
        {
            try
            {
                pst.close();
                con.close();
            } catch (SQLException ex)
            {
                System.out.println(ex.toString());
            }
        }
        return listaTarjeta;
    }

    public ArrayList<TarjetaPuntosC> buscarTarjetaCliente(String criterio)
    {
        ArrayList<TarjetaPuntosC> listaTarjeta = new ArrayList<>();
        try
        {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pablo", "pablo");

            String sql = "SELECT *"
                    + "FROM tarjetapuntos "
                    + "WHERE idcliente LIKE '" + criterio + "%'"
                    + "ORDER BY idtarjeta";
            pst = con.prepareStatement(sql);

            rs = pst.executeQuery();
//           


            while (rs.next())
                
            {
                
                int id1 = rs.getInt("idtarjeta");
                int id2 = rs.getInt("idcliente");
                int id3 = rs.getInt("idventa");
                String numeroTrajeta = rs.getString("numerotarjeta");
                Date vencimiento = rs.getDate("vencimientopuntos");
                SimpleDateFormat fechv = new SimpleDateFormat("dd/MM/yy");
//                Date fechav = (Date) fechv.parse(vencimiento);
                int totalP = rs.getInt("totalpuntos");

                TarjetaPuntosC det = new TarjetaPuntosC(id1, id2, id3);

                listaTarjeta.add(det);
            }

        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        } finally
        {
            try
            {
                pst.close();
                con.close();
            } catch (SQLException ex)
            {
                System.out.println(ex.toString());
            }
        }
        return listaTarjeta;
    }

    public ArrayList<ApartadosC> buscarApartados(String criterio)
    {
        ArrayList<ApartadosC> listaApartados = new ArrayList<>();
        try
        {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pablo", "pablo");

            String sql = "SELECT *"
                    + "FROM apartados "
                    + "WHERE idapartado LIKE '" + criterio + "%'"
                    + "ORDER BY idapartado";
            pst = con.prepareStatement(sql);

            rs = pst.executeQuery();

            while (rs.next())
            {
                int id1 = rs.getInt("idapartado");
                int id2 = rs.getInt("idcliente");
                int id3 = rs.getInt("idproducto");
                String descripcion = rs.getString("descripcion");
                int cantidad = rs.getInt("cantidad");
                int adelanto = rs.getInt("adelanto");
                String vencimientoPago = rs.getString("vencimientopago");

                ApartadosC det = new ApartadosC(id1, id2, id3, descripcion, cantidad, adelanto, vencimientoPago);

                listaApartados.add(det);
            }

        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        } finally
        {
            try
            {
                pst.close();
                con.close();
            } catch (SQLException ex)
            {
                System.out.println(ex.toString());
            }
        }
        return listaApartados;
    }

    public void borrarCliente(ClientesC c)
    {
        try
        {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pablo", "pablo");

            String sql = "DELETE FROM clientes where idcliente = ?";
            pst = con.prepareStatement(sql);

            pst.setInt(1, c.getIdCliente());

            pst.executeUpdate();

        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        } finally
        {
            try
            {
                pst.close();
                con.close();
            } catch (SQLException ex)
            {
                System.out.println(ex.toString());
            }
        }
    }

    public void borrarDepartamento(DepartamentosC d)
    {
        try
        {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pablo", "pablo");

            String sql = "DELETE FROM departamento where iddepartamento = ?";
            pst = con.prepareStatement(sql);

            pst.setInt(1, d.getIdDepartamento());

            pst.executeUpdate();

        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        } finally
        {
            try
            {
                pst.close();
                con.close();
            } catch (SQLException ex)
            {
                System.out.println(ex.toString());
            }
        }
    }

    public void borrarEmpleado(EmpleadosC e)
    {
        try
        {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pablo", "pablo");

            String sql = "DELETE FROM empleados where idempleado = ?";
            pst = con.prepareStatement(sql);

            pst.setInt(1, e.getIdEmpleado());

            pst.executeUpdate();

        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        } finally
        {
            try
            {
                pst.close();
                con.close();
            } catch (SQLException ex)
            {
                System.out.println(ex.toString());
            }
        }
    }

    public void borrarProveedor(ProveedoresC p)
    {
        try
        {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pablo", "pablo");

            String sql = "DELETE FROM proveedores where idproveedor = ?";
            pst = con.prepareStatement(sql);

            pst.setInt(1, p.getIdProveedor());

            pst.executeUpdate();

        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        } finally
        {
            try
            {
                pst.close();
                con.close();
            } catch (SQLException ex)
            {
                System.out.println(ex.toString());
            }
        }
    }

    public void borrarAlmacen(AlmacenC a)
    {
        try
        {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pablo", "pablo");

            String sql = "DELETE FROM almacen where idproducto = ?";
            pst = con.prepareStatement(sql);

            pst.setInt(1, a.getIdProducto());

            pst.executeUpdate();

        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        } finally
        {
            try
            {
                pst.close();
                con.close();
            } catch (SQLException ex)
            {
                System.out.println(ex.toString());
            }
        }
    }

    public void borrarVenta(VentasC v)
    {
        try
        {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pablo", "pablo");

            String sql = "DELETE FROM ventas where idventa = ?";
            pst = con.prepareStatement(sql);

            pst.setInt(1, v.getIdVenta());

            pst.executeUpdate();

        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        } finally
        {
            try
            {
                pst.close();
                con.close();
            } catch (SQLException ex)
            {
                System.out.println(ex.toString());
            }
        }
    }

    public void borrarEntrega(EntregasC e)
    {
        try
        {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pablo", "pablo");

            String sql = "DELETE FROM entregas where idproducto = ?";
            pst = con.prepareStatement(sql);

            pst.setInt(1, e.getIdProducto());

            pst.executeUpdate();

        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        } finally
        {
            try
            {
                pst.close();
                con.close();
            } catch (SQLException ex)
            {
                System.out.println(ex.toString());
            }
        }
    }

    public void borrarDetalleVenta(DetalleVentaC dv)
    {
        try
        {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pablo", "pablo");

            String sql = "DELETE FROM detalleventa where idventa = ?";
            pst = con.prepareStatement(sql);

            pst.setInt(1, dv.getIdVenta());

            pst.executeUpdate();

        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        } finally
        {
            try
            {
                pst.close();
                con.close();
            } catch (SQLException ex)
            {
                System.out.println(ex.toString());
            }
        }
    }

    public void borrarTarjeta(TarjetaPuntosC t)
    {
        try
        {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pablo", "pablo");

            String sql = "DELETE FROM tarjetapuntos where idtarjeta = ?";
            pst = con.prepareStatement(sql);

            pst.setInt(1, t.getIdTarjeta());

            pst.executeUpdate();

        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        } finally
        {
            try
            {
                pst.close();
                con.close();
            } catch (SQLException ex)
            {
                System.out.println(ex.toString());
            }
        }
    }

    public void borrarApartado(ApartadosC a)
    {
        try
        {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pablo", "pablo");

            String sql = "DELETE FROM apartados where idapartado = ?";
            pst = con.prepareStatement(sql);

            pst.setInt(1, a.getIdApartado());

            pst.executeUpdate();

        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        } finally
        {
            try
            {
                pst.close();
                con.close();
            } catch (SQLException ex)
            {
                System.out.println(ex.toString());
            }
        }
    }

    public void actualizarCliente(ClientesC c, int clave)
    {
        try
        {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pablo", "pablo");

            String sql = "UPDATE clientes SET idcliente = ?, nombre = ?, apellido_p = ?, apellido_m = ?, rfc = ?, telefono = ?,"
                    + " email = ? WHERE idcliente = ?";
            pst = con.prepareStatement(sql);

            pst.setInt(1, c.getIdCliente());
            pst.setString(2, c.getNombrec());
            pst.setString(3, c.getApellidopc());
            pst.setString(4, c.getApellidomc());
            pst.setString(5, c.getRFC());
            pst.setString(6, c.getTelefono());
            pst.setString(7, c.getEmail());
            pst.setInt(8, clave);

            pst.executeUpdate();

        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        } finally
        {
            try
            {
                pst.close();
                con.close();
            } catch (SQLException ex)
            {
                System.out.println(ex.toString());
            }
        }
    }

    public void actualizarDepartamento(DepartamentosC d, int clave)
    {
        try
        {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pablo", "pablo");

            String sql = "UPDATE departamento SET iddepartamento = ?, nombre_dep = ?, pasillo = ?, rack = ? "
                    + "WHERE iddepartamento = ?";
            pst = con.prepareStatement(sql);

            pst.setInt(1, d.getIdDepartamento());
            pst.setString(2, d.getNombreDep());
            pst.setInt(3, d.getPasillo());
            pst.setInt(4, d.getRack());
            pst.setInt(5, clave);

            pst.executeUpdate();

        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        } finally
        {
            try
            {
                pst.close();
                con.close();
            } catch (SQLException ex)
            {
                System.out.println(ex.toString());
            }
        }
    }

    public void actualizarEmpleado(EmpleadosC e, int clave)
    {
        try
        {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pablo", "pablo");

            String sql = "UPDATE clientes SET idempleado = ?, nombre = ?, apellido_p = ?, apellido_m = ?, puesto = ?, telefono = ?,"
                    + " direccionn = ?, salario = ? WHERE idempleado = ?";
            pst = con.prepareStatement(sql);

            pst.setInt(1, e.getIdEmpleado());
            pst.setString(2, e.getNombre());
            pst.setString(3, e.getApellidope());
            pst.setString(4, e.getApellidome());
            pst.setString(5, e.getPuesto());
            pst.setString(6, e.getTelefono());
            pst.setString(7, e.getDireccion());
            pst.setInt(8, e.getSalario());
            pst.setInt(9, clave);

            pst.executeUpdate();

        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        } finally
        {
            try
            {
                pst.close();
                con.close();
            } catch (SQLException ex)
            {
                System.out.println(ex.toString());
            }
        }
    }

    public void actualizarProveedor(ProveedoresC p, int clave)
    {
        try
        {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pablo", "pablo");

            String sql = "UPDATE departamento SET idproveedor = ?, telefono = ?, direccion = ?, nombre = ? "
                    + "WHERE idproveedor = ?";
            pst = con.prepareStatement(sql);

            pst.setInt(1, p.getIdProveedor());
            pst.setString(2, p.getTelefono());
            pst.setString(3, p.getDireccion());
            pst.setString(4, p.getNombreProv());
            pst.setInt(5, clave);

            pst.executeUpdate();

        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        } finally
        {
            try
            {
                pst.close();
                con.close();
            } catch (SQLException ex)
            {
                System.out.println(ex.toString());
            }
        }
    }

    public void actualizarAlmacen(AlmacenC a, int clave)
    {
        try
        {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pablo", "pablo");

            String sql = "UPDATE almacen SET idproducto = ?, iddepartamento = ?, nombre_producto = ?, descripcion = ? "
                    + "existencia = ?, precio = ? WHERE idproveedor = ?";
            pst = con.prepareStatement(sql);

            pst.setInt(1, a.getIdProducto());
            pst.setInt(2, a.getIdDepartamento());
            pst.setString(3, a.getNombre());
            pst.setString(4, a.getDescripcion());
            pst.setInt(5, a.getExistencia());
            pst.setDouble(6, a.getPrecio());
            pst.setInt(7, clave);

            pst.executeUpdate();

        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        } finally
        {
            try
            {
                pst.close();
                con.close();
            } catch (SQLException ex)
            {
                System.out.println(ex.toString());
            }
        }
    }

    public void actualizarVenta(VentasC v, int clave)
    {
        try
        {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pablo", "pablo");

            String sql = "UPDATE ventas SET idventa = ?, idcliente = ?, idempleado = ?, subtotal = ? "
                    + "fecha = ? WHERE idproveedor = ?";
            pst = con.prepareStatement(sql);

            pst.setInt(1, v.getIdVenta());
            pst.setInt(2, v.getIdCliente());
            pst.setInt(3, v.getIdEmpleado());
            pst.setDouble(4, v.getSubtotal());
            pst.setString(5, v.getFecha());
            pst.setInt(6, clave);

            pst.executeUpdate();

        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        } finally
        {
            try
            {
                pst.close();
                con.close();
            } catch (SQLException ex)
            {
                System.out.println(ex.toString());
            }
        }
    }

    public void actualizarEntrega(EntregasC e, int clave)
    {
        try
        {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pablo", "pablo");

            String sql = "UPDATE entregas SET cantidad = ?"
                    + "WHERE idproducto = ?";
            pst = con.prepareStatement(sql);

            pst.setInt(1, e.getCantidad());
            pst.setInt(2, clave);

            pst.executeUpdate();

        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        } finally
        {
            try
            {
                pst.close();
                con.close();
            } catch (SQLException ex)
            {
                System.out.println(ex.toString());
            }
        }
    }

    public void actualizarDetalleVenta(DetalleVentaC dv, int clave)
    {
        try
        {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pablo", "pablo");

            String sql = "UPDATE entregas SET idproducto = ?, idventa = ?, cantidad = ?, total = ? "
                    + "WHERE idproducto = ?";
            pst = con.prepareStatement(sql);

            pst.setInt(1, dv.getIdProducto());
            pst.setInt(2, dv.getIdVenta());
            pst.setInt(3, dv.getCantidad());
            pst.setDouble(4, dv.getTotal());
            pst.setInt(5, clave);

            pst.executeUpdate();

        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        } finally
        {
            try
            {
                pst.close();
                con.close();
            } catch (SQLException ex)
            {
                System.out.println(ex.toString());
            }
        }
    }

    public void actualizarTarjeta(TarjetaPuntosC t, int clave)
    {
        try
        {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pablo", "pablo");

            String sql = "UPDATE entregas SET idtarjeta = ?, idcliente = ?, idventa = ?, numerotarjeta = ?, vencimientopuntos = ? ,"
                    + " totalpuntos = ? WHERE idtarjeta = ?";
            pst = con.prepareStatement(sql);

            pst.setInt(1, t.getIdTarjeta());
            pst.setInt(2, t.getIdCliente());
            pst.setInt(3, t.getIdVenta());
            pst.setString(4, t.getNumeroTarjeta());
            pst.setString(5, t.getVencimientoPuntos().toString());
            pst.setInt(6, t.getTotalPuntos());
            pst.setInt(7, clave);

            pst.executeUpdate();

        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        } finally
        {
            try
            {
                pst.close();
                con.close();
            } catch (SQLException ex)
            {
                System.out.println(ex.toString());
            }
        }
    }

    public void actualizarApartado(ApartadosC a, int clave)
    {
        try
        {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pablo", "pablo");

            String sql = "UPDATE entregas SET idapartado = ?, idcliente = ?, idproducto = ?, descripcion = ?, cantidad = ? ,"
                    + " adelanto = ?, vencimientopago = ? WHERE idapartado = ?";
            pst = con.prepareStatement(sql);

            pst.setInt(1, a.getIdApartado());
            pst.setInt(2, a.getIdCliente());
            pst.setInt(3, a.getIdProducto());
            pst.setString(4, a.getDescripcion());
            pst.setInt(5, a.getCantidad());
            pst.setInt(6, a.getAdelanto());
            pst.setString(7, a.getVencimientoPago());
            pst.setInt(8, clave);

            pst.executeUpdate();

        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        } finally
        {
            try
            {
                pst.close();
                con.close();
            } catch (SQLException ex)
            {
                System.out.println(ex.toString());
            }
        }
    }

    public int regresarCantidad(int id)
    {
        int can = 0;
        try
        {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pablo", "pablo");

            cst = con.prepareCall("{? = call regresarCantidad(?)}");

            cst.registerOutParameter(1, Types.NUMERIC);

            cst.setInt(2, id);

            cst.execute();

            can = cst.getInt(1);

        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        } finally
        {
            try
            {
                pst.close();
                con.close();
            } catch (SQLException ex)
            {
                System.out.println(ex.toString());
            }
        }
        return can;
    }

    public void actualizarExistencias(int cantidad, int id)
    {
        try
        {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pablo", "pablo");

            cst = con.prepareCall("{call actualizarExistencia(?,?)}");

            cst.setInt(1, cantidad);
            cst.setInt(2, id);

            cst.execute();

        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        } finally
        {
            try
            {
                pst.close();
                con.close();
            } catch (SQLException ex)
            {
                System.out.println(ex.toString());
            }
        }
    }

    public ArrayList<EmpleadosC> consultarEmpleadosDespedidos()
    {
        ArrayList<EmpleadosC> listaEmpleados = new ArrayList<>();
        try
        {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pablo", "pablo");

            String sql = "SELECT *"
                    + "FROM desempleados "
                    + "ORDER BY idempleado";

            pst = con.prepareStatement(sql);

            rs = pst.executeQuery();

            while (rs.next())
            {
                int id = rs.getInt("idempleado");
                String nombre = rs.getString("nombre");
                String apeP = rs.getString("apellido_p");
                String apeM = rs.getString("apellido_m");
                String fecha = rs.getString("fecha");

                EmpleadosC e = new EmpleadosC(id, nombre, apeP, apeM, fecha, "", "", 0);

                listaEmpleados.add(e);
            }

        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        } finally
        {
            try
            {
                pst.close();
                con.close();
            } catch (SQLException ex)
            {
                System.out.println(ex.toString());
            }
        }
        return listaEmpleados;
    }

    public void sumarCanti(int cantidad, int id)
    {
        try
        {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pablo", "pablo");

            cst = con.prepareCall("{call sumarcantidad(?,?)}");

            cst.setInt(1, cantidad);
            cst.setInt(2, id);

            cst.execute();

        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        } finally
        {
            try
            {
                pst.close();
                con.close();
            } catch (SQLException ex)
            {
                System.out.println(ex.toString());
            }
        }
    }

    public ArrayList<Ticket> consultarTicket()
    {
        ArrayList<Ticket> listaTicket = new ArrayList<>();
        try
        {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pablo", "pablo");

            String sql = "SELECT *"
                    + "FROM vista";
            pst = con.prepareStatement(sql);

            rs = pst.executeQuery();

            while (rs.next())
            {
                int idEmp = rs.getInt("idempleado");
                int idVen = rs.getInt("idventa");
                String nombre = rs.getString("nombre");
                String apellidoP = rs.getString("apellido_p");
                String apellidoM = rs.getString("apellido_m");
                String nomProducto = rs.getString("nombre_producto");
                int cantidad = rs.getInt("cantidad");
                double subtotal = rs.getDouble("subtotal");
                double total = rs.getDouble("total");
                String fecha = rs.getString("fecha");
                double precio = rs.getDouble("precio");

                Ticket t = new Ticket(idEmp, idVen, nombre, apellidoP, apellidoM, nomProducto, cantidad, subtotal, total, fecha, precio);

                listaTicket.add(t);
            }

        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        } finally
        {
            try
            {
                pst.close();
                con.close();
            } catch (SQLException ex)
            {
                System.out.println(ex.toString());
            }
        }
        return listaTicket;
    }

    public void sumapuntos(int idcliente, int idtarjeta, int idventa)
    {
        try
        {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pablo", "pablo");

            cst = con.prepareCall("{call sumapuntos(?,?,?)}");
            cst.setInt(2, idtarjeta);
            cst.setInt(1, idcliente);
            cst.setInt(3, idventa);
//            cst.setString(4, fecha);

            cst.execute();

        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        } finally
        {
            try
            {
                pst.close();
                con.close();
            } catch (SQLException ex)
            {
                System.out.println(ex.toString());
            }
        }
    }

    public void consultaventa(int idventa)
    {
        try
        {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pablo", "pablo");

            cst = con.prepareCall("{call consulta_venta(?)}");

            cst.setInt(1, idventa);

            cst.execute();

        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        } finally
        {
            try
            {
                pst.close();
                con.close();
            } catch (SQLException ex)
            {
                System.out.println(ex.toString());
            }
        }
    }

    public ArrayList<Consultav> consultaInfo(String parametro)
    {
        ArrayList<Consultav> listaInfo = new ArrayList<>();
        try
        {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pablo", "pablo");

            String sql = "SELECT * FROM "
                    + "consultas_venta "
                    + "WHERE idventa LIKE '" + parametro + "%' "
                    + "ORDER BY idventa";

//            pst = con.prepareStatement(sql);
            Statement s = con.createStatement();
            rs = s.executeQuery(sql);

            while (rs.next())
            {

                String num = rs.getString("idventa");
                String string = rs.getString("informacion_venta");
                Consultav co = new Consultav(num, string);

                listaInfo.add(co);

            }

        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        } finally
        {
            try
            {

                con.close();
            } catch (SQLException ex)
            {
                System.out.println(ex.toString());
            }
        }
        return listaInfo;
    }

}
