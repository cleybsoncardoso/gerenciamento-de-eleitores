<?php



        $credencial= URLEncode("63830A72210D36C466B733D9BB3F9DD765534F09"); //**Credencial da Conta 40 caracteres
        $token= URLEncode("63e3e2"); //**Token da Conta 6 caracteres
        $response = fopen("http://www.mpgateway.com/v_3_00/sms/smscredits/credits.aspx?Credencial=".$credencial."&Token=".$token,"r");
        $status_code= fgets($response,4);
        $status_code=$status_code*0.1;
            echo "R$ ".$status_code;
?>