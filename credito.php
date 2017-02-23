<?php


        $dados = $_GET['saldo'];
        $informacoes = explode(":",$dados);
        $credencial= URLEncode($informacoes[0]); //**Credencial da Conta 40 caracteres
        $token= URLEncode($informacoes[1]); //**Token da Conta 6 caracteres
        $response = fopen("http://www.mpgateway.com/v_3_00/sms/smscredits/credits.aspx?Credencial=".$credencial."&Token=".$token,"r");
        $status_code= fgets($response,4);
        $status_code=$status_code*0.1;
            echo "R$ ".$status_code;
?>