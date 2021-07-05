object Form1: TForm1
  Left = 0
  Top = 0
  Caption = 'Form1'
  ClientHeight = 231
  ClientWidth = 505
  Color = clBtnFace
  Font.Charset = DEFAULT_CHARSET
  Font.Color = clWindowText
  Font.Height = -11
  Font.Name = 'Tahoma'
  Font.Style = []
  OldCreateOrder = False
  PixelsPerInch = 96
  TextHeight = 13
  object Label1: TLabel
    Left = 80
    Top = 64
    Width = 41
    Height = 13
    Caption = 'Nombre:'
  end
  object Label2: TLabel
    Left = 75
    Top = 99
    Width = 46
    Height = 13
    Caption = 'Apellidos:'
  end
  object Label3: TLabel
    Left = 90
    Top = 125
    Width = 31
    Height = 18
    Caption = 'Clave:'
  end
  object Edit1: TEdit
    Left = 127
    Top = 61
    Width = 162
    Height = 21
    TabOrder = 0
  end
  object Edit2: TEdit
    Left = 127
    Top = 88
    Width = 162
    Height = 21
    TabOrder = 1
  end
  object Edit3: TEdit
    Left = 127
    Top = 118
    Width = 162
    Height = 21
    PasswordChar = '*'
    TabOrder = 2
  end
  object Button1: TButton
    Left = 336
    Top = 59
    Width = 75
    Height = 25
    Caption = 'OK'
    TabOrder = 3
  end
  object Button2: TButton
    Left = 336
    Top = 116
    Width = 75
    Height = 25
    Caption = 'CANCEL'
    TabOrder = 4
  end
end
