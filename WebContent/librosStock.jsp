<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>SB Admin 2 - Bootstrap Admin Theme</title>

    <!-- Bootstrap Core CSS -->
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- MetisMenu CSS -->
    <link href="vendor/metisMenu/metisMenu.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="dist/css/sb-admin-2.css" rel="stylesheet">

    <!-- Morris Charts CSS -->
    <link href="vendor/morrisjs/morris.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    
    <link href="css/main.css" rel="stylesheet">

</head>
<body>

    <div id="wrapper">

        <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
               
            </div>

            <ul class="nav navbar-top-links navbar-right">
    <!-- Campanita editor de cosas -GESTOR  -->
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#menuPanel">
                        <i class="fa fa-bell fa-fw"></i> <i class="fa fa-caret-down"></i>
                    </a>
                    
                    <ul class="dropdown-menu dropdown-user">
              <!--Aqui deberia haber un escalon-->
                    <li>
                     <div class="sidebar-nav navbar-collapse"> 
                        <ul class="nav" id="side-menu" id="menuPanel"> 
                          
                    
                       
<!-------------------------------------------------------->
                        <li>
                          <a href="#">
                             <i class="fa fa-tasks fa-fw"></i> Editar Libros
                                <span class="fa arrow"></span> </a>               
                                <ul class="nav nav-second-level">
                                   <div>
                                    <li>
                                        <a href="Servler">Insertar Libro</a>
                                    </li>
                                    <li>
                                        <a href="Servler">Eliminar Libro</a>
                                    </li>
                                    <li>
                                        <a href="Servler">Actualizar Libro</a>
                                    </li>
                                    <li>
                                        <a href="Servler">Mostrar Libro</a>
                                    </li>
                                    </div>
                                </ul>     
                                          
                           </li>
                                <li class="divider"></li>
                        <li>
                                    <a href="#">
                                        <div>
                                            <i class="fa fa-tasks fa-fw"></i> Editar Usuarios
                                        </div>
                                    </a>
                        </li>
                                <li class="divider"></li> <!---ESTO NO SE QUE ES-->
                        <li>
                                    <a href="#">
                                        <div>
                                            <i class="fa fa-tasks fa-fw"></i> Editar Provedores
                                        </div>
                                    </a>
                        </li>
  <!-------------------------------------------------------->
                           
                        </ul>
                      </div> 
                    </li>   
                    </ul>
                </li>
    
    
<!--Personitaa - Usuario-->
                 <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                        <i class="fa fa-user fa-fw"></i> <i class="fa fa-caret-down"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-user">
                        <li><a href="#"><i class="fa fa-user fa-fw"></i> Iniciar sesi�n</a>
                        </li>
                        <li class="divider"></li>
                        <li><a href="login.html"><i class="fa fa-sign-out fa-fw"></i> Cerrar Sesi�n</a>
                        </li>
                    </ul>
                    
                </li>
               
            </ul>
           
           
           
     <!-- Menu de la izquierda -->

            <div class="navbar-default sidebar" role="navigation">
                <div class="sidebar-nav navbar-collapse">
                    <ul class="nav" id="side-menu">
                       
                        <li class="sidebar-search" id="categoria"> Categor�as
                            
                        </li>
                        
                        
                        <li>
                            <a href="index.html"><i class="fa fa-github-alt fa-fw"></i> Fantas�a</a>
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-github-alt fa-fw"></i> Rom�ntica<!--<span class="fa arrow"></span>--></a>
                           
                        </li>
                        <li>
                            <a href="tables.html"><i class="fa fa-github-alt fa-fw"></i> Infantil</a>
                        </li>
                        <li>
                            <a href="forms.html"><i class="fa fa-github-alt fa-fw"></i> Hist�rica</a>
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-github-alt fa-fw"></i> Policiaca<!--<span class="fa arrow"></span>--></a>
                            
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-github-alt fa-fw"></i> Terror<!--<span class="fa arrow"></span>--></a>
                          
                        </li>
                        
                    </ul>
                </div>
            </div>
        </nav>
        <div id="page-wrapper">
            <div class="row">
                <div class="col-lg-12">
                    <header>
                        <h1 class="page-header">FrikiLibros</h1>
                    </header>
                    <main>
                        <div class="panel panel-default">
                            <header class="panel-heading tituloLibro">T�tulo del Libro </header>
                             <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <table width="100%" class="table table-striped table-bordered table-hover" id="dataTables-example">
                                <thead>
                               
                                    <tr>
                                        <th>ISBN</th>
                                        <th>Libro</th>
                                        <th>Stock</th>
                                    </tr>
                                </thead>
                                <tbody>
                                
                                <!-- for each para iterar sobre listado de libros e imprimir los libros con sus atributos-->
                                
                                <c:forEach var="libro" items="${listadoLibros}">
                                    <tr class="table forEach">
                                        <td>${Libro.getISBN()}</td>
                                        <td>${Libro.getTitulo()}</td>
                                        <td>${Libro.getStock()}</td>
                                    </tr>
                                    </c:forEach>
                                    </tbody>
                            </table>
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-12 -->
            </div>
                        </div>
                    </main>


                </div>
                <!-- /.col-lg-12 -->
            </div>
            <div>

            </div>
        </div>
        <!-- /#page-wrapper -->

    </div>
    <!-- /#wrapper -->

    <!-- jQuery -->
    <script src="../vendor/jquery/jquery.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="../vendor/bootstrap/js/bootstrap.min.js"></script>

    <!-- Metis Menu Plugin JavaScript -->
    <script src="../vendor/metisMenu/metisMenu.min.js"></script>

    <!-- Morris Charts JavaScript -->
    <script src="../vendor/raphael/raphael.min.js"></script>
    <script src="../vendor/morrisjs/morris.min.js"></script>
    <script src="../data/morris-data.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="../dist/js/sb-admin-2.js"></script>

</body>

</html>