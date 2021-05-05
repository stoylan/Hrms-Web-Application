

<html>

    <head><link rel="alternate" type="text/xml" href="/Service/KPSPublic.asmx?disco" />

    <style type="text/css">
    
		BODY { color: #000000; background-color: white; font-family: Verdana; margin-left: 0px; margin-top: 0px; }
		#content { margin-left: 30px; font-size: .70em; padding-bottom: 2em; }
		A:link { color: #336699; font-weight: bold; text-decoration: underline; }
		A:visited { color: #6699cc; font-weight: bold; text-decoration: underline; }
		A:active { color: #336699; font-weight: bold; text-decoration: underline; }
		A:hover { color: cc3300; font-weight: bold; text-decoration: underline; }
		P { color: #000000; margin-top: 0px; margin-bottom: 12px; font-family: Verdana; }
		pre { background-color: #e5e5cc; padding: 5px; font-family: Courier New; font-size: x-small; margin-top: -5px; border: 1px #f0f0e0 solid; }
		td { color: #000000; font-family: Verdana; font-size: .7em; }
		h2 { font-size: 1.5em; font-weight: bold; margin-top: 25px; margin-bottom: 10px; border-top: 1px solid #003366; margin-left: -15px; color: #003366; }
		h3 { font-size: 1.1em; color: #000000; margin-left: -15px; margin-top: 10px; margin-bottom: 10px; }
		ul { margin-top: 10px; margin-left: 20px; }
		ol { margin-top: 10px; margin-left: 20px; }
		li { margin-top: 10px; color: #000000; }
		font.value { color: darkblue; font: bold; }
		font.key { color: darkgreen; font: bold; }
		font.error { color: darkred; font: bold; }
		.heading1 { color: #ffffff; font-family: Tahoma; font-size: 26px; font-weight: normal; background-color: #003366; margin-top: 0px; margin-bottom: 0px; margin-left: -30px; padding-top: 10px; padding-bottom: 3px; padding-left: 15px; width: 105%; }
		.button { background-color: #dcdcdc; font-family: Verdana; font-size: 1em; border-top: #cccccc 1px solid; border-bottom: #666666 1px solid; border-left: #cccccc 1px solid; border-right: #666666 1px solid; }
		.frmheader { color: #000000; background: #dcdcdc; font-family: Verdana; font-size: .7em; font-weight: normal; border-bottom: 1px solid #dcdcdc; padding-top: 2px; padding-bottom: 2px; }
		.frmtext { font-family: Verdana; font-size: .7em; margin-top: 8px; margin-bottom: 0px; margin-left: 32px; }
		.frmInput { font-family: Verdana; font-size: 1em; }
		.intro { margin-left: -15px; }
           
    </style>

    <title>
	KPSPublic Web Service
</title></head>

  <body>

    <div id="content">

      <p class="heading1">KPSPublic</p><br>

      

      

      <span>
          <p class="intro">Click <a href="KPSPublic.asmx">here</a> for a complete list of operations.</p>
          <h2>TCKimlikNoDogrula</h2>
          <p class="intro"></p>

          <h3>Test</h3>
          
          The test form is only available for requests from the local machine.
                 <span>
              <h3>SOAP 1.1</h3>
              <p>The following is a sample SOAP 1.1 request and response.  The <font class=value>placeholders</font> shown need to be replaced with actual values.</p>

              <pre>POST /Service/KPSPublic.asmx HTTP/1.1
Host: tckimlik.nvi.gov.tr
Content-Type: text/xml; charset=utf-8
Content-Length: <font class=value>length</font>
SOAPAction: "http://tckimlik.nvi.gov.tr/WS/TCKimlikNoDogrula"

&lt;?xml version="1.0" encoding="utf-8"?&gt;
&lt;soap:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"&gt;
  &lt;soap:Body&gt;
    &lt;TCKimlikNoDogrula xmlns="http://tckimlik.nvi.gov.tr/WS"&gt;
      &lt;TCKimlikNo&gt;<font class=value>long</font>&lt;/TCKimlikNo&gt;
      &lt;Ad&gt;<font class=value>string</font>&lt;/Ad&gt;
      &lt;Soyad&gt;<font class=value>string</font>&lt;/Soyad&gt;
      &lt;DogumYili&gt;<font class=value>int</font>&lt;/DogumYili&gt;
    &lt;/TCKimlikNoDogrula&gt;
  &lt;/soap:Body&gt;
&lt;/soap:Envelope&gt;</pre>

              <pre>HTTP/1.1 200 OK
Content-Type: text/xml; charset=utf-8
Content-Length: <font class=value>length</font>

&lt;?xml version="1.0" encoding="utf-8"?&gt;
&lt;soap:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"&gt;
  &lt;soap:Body&gt;
    &lt;TCKimlikNoDogrulaResponse xmlns="http://tckimlik.nvi.gov.tr/WS"&gt;
      &lt;TCKimlikNoDogrulaResult&gt;<font class=value>boolean</font>&lt;/TCKimlikNoDogrulaResult&gt;
    &lt;/TCKimlikNoDogrulaResponse&gt;
  &lt;/soap:Body&gt;
&lt;/soap:Envelope&gt;</pre>
          </span>

          <span>
              <h3>SOAP 1.2</h3>
              <p>The following is a sample SOAP 1.2 request and response.  The <font class=value>placeholders</font> shown need to be replaced with actual values.</p>

              <pre>POST /Service/KPSPublic.asmx HTTP/1.1
Host: tckimlik.nvi.gov.tr
Content-Type: application/soap+xml; charset=utf-8
Content-Length: <font class=value>length</font>

&lt;?xml version="1.0" encoding="utf-8"?&gt;
&lt;soap12:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://www.w3.org/2003/05/soap-envelope"&gt;
  &lt;soap12:Body&gt;
    &lt;TCKimlikNoDogrula xmlns="http://tckimlik.nvi.gov.tr/WS"&gt;
      &lt;TCKimlikNo&gt;<font class=value>long</font>&lt;/TCKimlikNo&gt;
      &lt;Ad&gt;<font class=value>string</font>&lt;/Ad&gt;
      &lt;Soyad&gt;<font class=value>string</font>&lt;/Soyad&gt;
      &lt;DogumYili&gt;<font class=value>int</font>&lt;/DogumYili&gt;
    &lt;/TCKimlikNoDogrula&gt;
  &lt;/soap12:Body&gt;
&lt;/soap12:Envelope&gt;</pre>

              <pre>HTTP/1.1 200 OK
Content-Type: application/soap+xml; charset=utf-8
Content-Length: <font class=value>length</font>

&lt;?xml version="1.0" encoding="utf-8"?&gt;
&lt;soap12:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://www.w3.org/2003/05/soap-envelope"&gt;
  &lt;soap12:Body&gt;
    &lt;TCKimlikNoDogrulaResponse xmlns="http://tckimlik.nvi.gov.tr/WS"&gt;
      &lt;TCKimlikNoDogrulaResult&gt;<font class=value>boolean</font>&lt;/TCKimlikNoDogrulaResult&gt;
    &lt;/TCKimlikNoDogrulaResponse&gt;
  &lt;/soap12:Body&gt;
&lt;/soap12:Envelope&gt;</pre>
          </span>

          

          

      </span>
      

    
    
      

      

    
  </body>
</html>
