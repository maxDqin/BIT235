<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
   <head>
      <title>EL Implicit Objects: Request Parameters</title>
   </head>

   <body>
      <form action='_____'>	
 <table>
            <tr>
               <td>First Name:</td>
               <td><input type='text' name='firstName'/></td>
            </tr>
            <tr>
               <td>Last Name:</td>
               <td><input type='text' name='lastName'/></td>
            </tr>
            <tr>
               <td>Subject:</td>
               <td><input type='text' name='subject'/></td>
            </tr>
            <tr>
               <td>
                  Select hours that you spend on this subject every week: 
               </td>
               <td>
                  <select name='hours' size='7' multiple='false'>
                     <option value='less than 1 h'>less than 1 h</option>
                     <option value='1-2 hs'>1-2 hs</option>
                     <option value='2-4 hs'>2-4 hs</option>
                     <option value='4-6 hs'>4-6 hs</option>
                     <option value='6-8 hs'>6-8 hs</option>
                     <option value='more than 8 hs'> more than 8 hs </option>
                  </select>
               </td>
            </tr>
         </table>
         <p><input type='submit' value='Finish Survey'/>
      </form>
   </body>
</html>	