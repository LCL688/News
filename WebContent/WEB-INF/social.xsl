<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
		<!-- TODO: Auto-generated template -->
 <html>
 <body>
   <h2>My CD Collection</h2>
   <table border="1">
     <tr bgcolor="#9acd32">
       <th>Title</th>
       <th>Artist</th>
     </tr>
     <tr>
       <td><xsl:value-of select="social/news/id"/></td>
       <td><xsl:value-of select="social/news/title"/></td>
     </tr>
   </table>
 </body>
 </html>
	</xsl:template>
</xsl:stylesheet>