<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>FrikiLibros</title>

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
                    <span class="sr-only"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>

            </div>

            <!-- MENU SUPERIOR ------------------------------------------------------------------------------------------------------------- -->
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
                                            <span class="fa arrow"></span> 
                                       </a>
                                        <ul class="nav nav-second-level">
                                            
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
                                            
                                        </ul>

                                    </li>
                                    <li class="divider"></li>
                                    <li>
                                        <a href="#">
                                            
                                                <i class="fa fa-tasks fa-fw"></i> Editar Usuarios
                                            
                                        </a>
                                    </li>
                                    <li class="divider"></li>
                                    <!---ESTO NO SE QUE ES-->
                                    <li>
                                        <a href="#">
                                           
                                                <i class="fa fa-tasks fa-fw"></i> Editar Provedores
                                            
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
                        <li><a href="#"><i class="fa fa-user fa-fw"></i> Administrador</a>
                        </li>
                        <li class="divider"></li>
                        <li><a href="#"><i class="fa fa-sign-out fa-fw"></i> Cerrar Sesión</a>
                        </li>
                    </ul>

                </li>

            </ul>



            <!-- Menu de la izquierda-------------------------------------------------------------------------------------------------------------------- -->

            <div class="navbar-default sidebar" role="navigation">
                <div class="sidebar-nav navbar-collapse">
                    <ul class="nav" id="side-menu">

                        <li class="sidebar-search" id="categoria">
                            <a href="Servlet?opcion=listadoGeneral"> Listado General </a>
                        </li>

                        <li class="sidebar-search" id="categoria"> Categorías
                        </li>

                        <li>
                            <a href="Servlet?columna=terror&opcion=listadoCategorias"><i class="fa fa-github-alt fa-fw"></i> Terror</a>
                        </li>
                        <li>
                            <a href="Servlet?columna=thriller&opcion=listadoCategorias"><i class="fa fa-github-alt fa-fw"></i> Thriller</a>

                        </li>
                        <li>
                            <a href="Servlet?columna=dragones&opcion=listadoCategorias"><i class="fa fa-github-alt fa-fw"></i> Dragones</a>
                        </li>
                        <li>
                            <a href="Servlet?columna=cienciaFiccion&opcion=listadoCategorias"><i class="fa fa-github-alt fa-fw"></i> Ciencia Ficción</a>
                        </li>
                        <li>
                            <a href="Servlet?columna=fantasiaEpica&opcion=listadoCategorias"><i class="fa fa-github-alt fa-fw"></i> Fantasía Épica</a>


                    </ul>
                </div>
            </div>
        </nav>
