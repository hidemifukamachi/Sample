<!DOCTYPE html>
<html>
<head>
    <title>Grails Helo</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <style type="text/css">
    body {color: #006600;}
    h1 {background: #99ff99;font-size: 14pt;padding: 5px;}
    h2 {font-size: 12pt; font-weight: bold;}
    p {font-size: 10pt;}
    </style>
</head>
<body>
    <h1>${title}</h1>
    <h2>${msg}</h2>
    <g:form controller="helo">
        <g:textField name="input" value="${value}"></g:textField>
        <g:actionSubmit value="送信" action="form" />
    </g:form>
</body>
</html>