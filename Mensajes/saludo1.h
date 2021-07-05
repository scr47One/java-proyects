//---------------------------------------------------------------------------

#ifndef saludo1H
#define saludo1H
//---------------------------------------------------------------------------
#include <System.Classes.hpp>
#include <Vcl.Controls.hpp>
#include <Vcl.StdCtrls.hpp>
#include <Vcl.Forms.hpp>
//---------------------------------------------------------------------------
class TSaludoBox : public TForm
{
__published:	// IDE-managed Components
	TLabel *Label1;
private:	// User declarations
public:		// User declarations
	__fastcall TSaludoBox(TComponent* Owner);
};
//---------------------------------------------------------------------------
extern PACKAGE TSaludoBox *SaludoBox;
//---------------------------------------------------------------------------
#endif
