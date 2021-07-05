//---------------------------------------------------------------------------

#ifndef Unit1H
#define Unit1H
//---------------------------------------------------------------------------
#include <System.Classes.hpp>
#include <Vcl.Controls.hpp>
#include <Vcl.StdCtrls.hpp>
#include <Vcl.Forms.hpp>
//---------------------------------------------------------------------------
class TArreglo : public TForm
{
__published:	// IDE-managed Components
	TLabel *Label1;
	TEdit *texto;
	TButton *Button1;
	TLabel *Label2;
	void __fastcall Button1Click(TObject *Sender);
private:	// User declarations
public:		// User declarations
	__fastcall TArreglo(TComponent* Owner);
};
//---------------------------------------------------------------------------
extern PACKAGE TArreglo *Arreglo;
//---------------------------------------------------------------------------
#endif
