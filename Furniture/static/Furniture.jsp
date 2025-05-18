<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>License</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <style>
        body{
        Backgound-color:pink;
        }

    </style>
     </head>
     <body>
     <nav class="navbar navbar-expand-lg navbar navbar-light" style="background-color: #e3f2fd;">
         <div class="container-fluid">
             <a class="navbar-brand" href="#">X-WORKZ</a>
             <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                 <span class="navbar-toggler-icon"></span>
             </button>
             <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
                 <div class="navbar-nav">
                     <a class="nav-link active" aria-current="page" href="index.jsp">Home</a>
                     <a class="nav-link" href="Furniture.jsp">Furniture</a>

                 </div>
             </div>
         </div>
     </nav>
     <div align="center">
     <h1>Grab your seating</h1>
     <!--<form>
         BRAND:<input type="text" placeholder="enter name" name="Name"><br>
         MODEL:<input type="model" placeholder="enter model" name="Model"><br>
         PRODUCT DETAIL:<input type="details" placeholder="enter product details" name="ProductDetails"><br>
         <label for="size">Select Size:</label>
         <select name="size" id="size">
             <option value="">--Select Size--</option>
             <option value="S">Small</option>
             <option value="M">Medium</option>
             <option value="L">Large</option>
             <option value="XL">Extra Large</option>
         </select><br><br>
         <input type="submit" value="submit">-->
         <div class="container w-50 mx-auto mt-5">

                 <h1>FURNITURE DETAILS</h1>
                 <form action="Furniture" method="post">
                     <div class="mb-3">
                         <label  class="form-label">Brand</label>
                         <input type="Brand" placeholder="enter brand" name="Brand">
                         <!--<div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>-->
                     </div>
                     <div class="mb-3">
                         <label class="form-label">Size</label>
                         <input type="Size" placeholder="enter size" name="Size">
                     </div>
                     <div class="mb-3">
                         <label  class="form-label">ModelName</label>
                         <input type="ModelNmae" placeholder="enter model name" name="ModelName">
                     </div>
                     <div class="mb-3">
                         <label  class="form-label">Product Benefits</label>
                         <input type="Product Benefits" placeholder="enter benefits" name="ProductBenefits">
                     </div>
                     <button type="submit" class="btn btn-primary">Submit</button>
                 </form>

     </div>
     </div>
     </body>
</html>