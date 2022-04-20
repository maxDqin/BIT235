<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
   <head>
      <title>EL Implicit Objects: Request Parameters</title></head>

   <body>
      <form action='______'>	
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
               <td>Select hours that you spend on this subject every week:</td>
               <td>
                  <select name='methods' size='5' multiple='true'>
                     <option value='lecture'>lecture</option>
                     <option value='tutorial'>tutorial</option>
                     <option value='reading'>reading</option>
                     <option value='coding'>coding</option>
                     <option value='pairprogramming'>pair programming</option>
                  </select>
               </td>
            </tr>
         </table>
         <p><input type='submit' value='Finish Survey'/>
      </form>
   </body>
</html>	
