object Arreglo: TArreglo
  Left = 0
  Top = 0
  Caption = 'Arreglo'
  ClientHeight = 310
  ClientWidth = 219
  Color = clBtnFace
  Font.Charset = DEFAULT_CHARSET
  Font.Color = clWindowText
  Font.Height = -11
  Font.Name = 'Tahoma'
  Font.Style = []
  OldCreateOrder = False
  Position = poMainFormCenter
  PixelsPerInch = 96
  TextHeight = 13
  object Label1: TLabel
    Left = 32
    Top = 64
    Width = 16
    Height = 60
    Alignment = taCenter
    Font.Charset = DEFAULT_CHARSET
    Font.Color = clWindowText
    Font.Height = -50
    Font.Name = 'Tahoma'
    Font.Style = []
    ParentFont = False
  end
  object Label2: TLabel
    Left = 32
    Top = 160
    Width = 152
    Height = 13
    Caption = 'Ingrese la posici'#243'n en el arreglo'
  end
  object texto: TEdit
    Left = 48
    Top = 195
    Width = 121
    Height = 21
    TabOrder = 0
    Text = 'texto'
  end
  object Button1: TButton
    Left = 67
    Top = 232
    Width = 75
    Height = 25
    Caption = 'Aceptar'
    TabOrder = 1
    OnClick = Button1Click
  end
end
