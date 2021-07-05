//---------------------------------------------------------------------------

#include <vcl.h>
#pragma hdrstop

#include "Unit1.h"
//---------------------------------------------------------------------------
#pragma package(smart_init)
#pragma resource "*.dfm"
TArreglo *Arreglo;
//---------------------------------------------------------------------------
__fastcall TArreglo::TArreglo(TComponent* Owner)
	: TForm(Owner)
{
}
//---------------------------------------------------------------------------
void __fastcall TArreglo::Button1Click(TObject *Sender)
{

String arr[5];

arr[0]="Hola 1";
arr[1]="Hola 2";
arr[2]="Hola 3";
arr[3]="Hola 4";
arr[4]="Hola 5";

int i = StrToInt(texto->Text);
if (texto->Text!=NULL&&StrToInt(texto->Text<6))
{
		Label1->Caption=arr[i-1];
}

}
//---------------------------------------------------------------------------
