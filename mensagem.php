<?php

        $dados = $_POST['dados'];
        $informacoes = explode(":",$dados);
        $credencial= URLEncode("63830A72210D36C466B733D9BB3F9DD765534F09"); //**Credencial da Conta 40 caracteres
        $token= URLEncode("63e3e2"); //**Token da Conta 6 caracteres
        $principal = URLEncode("aaa");  //* SEU CODIGO PARA CONTROLE, não colocar e-mail
        $auxuser = URLEncode("AUX_USER"); //* SEU CODIGO PARA CONTROLE, não colocar e-mail
        $mobile= URLEncode($informacoes[0]); //* Numero do telefone  FORMATO: PAÍS+DDD(DOIS DÍGITOS)+NÚMERO
        $sendproj = URLEncode("N"); //* S = Envia o SenderId antes da mensagem , N = Não envia o SenderId
        $msg=$informacoes[1]; // Mensagem
        $msg=mb_convert_encoding($msg, "UTF-8"); // Converte a mensagem para não ocorrer erros com caracteres semi-gráficos
        $msg = URLEncode($msg);
        $response = fopen("https://www.mpgateway.com/v_3_00/sms/smspush/enviasms.aspx?Credencial=".$credencial."&TOKEN=".$token."&PRINCIPAL_USER=".$principal."&AUX_USER=".$auxuser."&MOBILE=".$mobile."&SEND_PROJECT=".$sendproj."&MESSAGE=".$msg,"r");
        $status_code= fgets($response,4);
            echo $status_code;
?>