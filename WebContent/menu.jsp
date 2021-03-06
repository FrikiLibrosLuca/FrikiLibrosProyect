<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="e">

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

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

    <div id="wrapper">

        <!-- Navigation---------------------------------------------------------------------------------------------------------------------------------------------- -->
        <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <img class="logo" src="imagenes/logoFriki.png" width="250" height="50" align="middle">
            </div>

            <!-- MENU SUPERIOR--------------------------------------------------------------------------------------------------------------------- -->
            <ul class="nav navbar-top-links navbar-right">
            <c:if test="${privilegio}">
            	<jsp:include page="campanaAdmin.jsp"/>
            </c:if>
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                        <i class="fa fa-user fa-fw"></i> <i class="fa fa-caret-down"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-user">
                        <li><a href="login.html"><i class="fa fa-user fa-fw"></i> Iniciar sesión</a>
                        </li>

                        <li class="divider"></li>
                        <li><a href="#"><i class="fa fa-sign-out fa-fw"></i> Cerrar Sesión</a>
                        </li>
                    </ul>

                </li>

            </ul>

            <!-- MENU IZQUIERDO ----------------------------------------------------------------------------------------------------------------- -->
            <div class="navbar-default sidebar" role="navigation">
                <div class="sidebar-nav navbar-collapse">
                    <ul class="nav" id="side-menu">
                    <!-- Lupita buscador -->	
						<li class="sidebar-search ">
				            <form action="Servlet" method="get">
				            <div class="input-group custom-search-form">
				           		<div class="form-group">
	                                <label>Buscar por:</label>
	                                <select class="form-control" name="campo">
	                                    <option value="autor">Autor</option>
	                                    <option value="titulo">Titulo</option>
	                                </select>
	                            </div>
	                            <div>
				                <input type="text" name="valor" class="form-control" placeholder="Buscar...">
				                   <span class="input-group-btn">
				                   <input class="botonLupita btn btn-default" type="submit" name="opcion"/>
				                   <i class="fa fa-search"></i>
				                  
				                   </span>
				                </div>
				                <input type="hidden" name="opcion" value="busqueda">
				             </div>
				             </form>
				         </li>
                        <li class="sidebar-search">
                            <a href="Servlet?opcion=listadoGeneral"> Listado General</a>
                        </li>
                        <li class="sidebar-search" id="categoria"> Categorías
                        </li>
                        <li>
                            <a href="Servlet?columna=Terror&opcion=listadoCategoria"><i class="fa fa-github-alt fa-fw"></i> Terror</a>
                        </li>
                        <li>
                            <a href="Servlet?columna=Thriller&opcion=listadoCategoria"><i class="fa fa-github-alt fa-fw"></i> Thriller</a>
                        </li>
                        <li>
                            <a href="Servlet?columna=Dragones&opcion=listadoCategoria"><i class="fa fa-github-alt fa-fw"></i> Dragones</a>
                        </li>
                        <li>
                            <a href="Servlet?columna=Ciencia Ficción&opcion=listadoCategoria"><i class="fa fa-github-alt fa-fw"></i> Ciencia Ficción</a>
                        </li>
                        <li>
                            <a href="Servlet?columna=Fantasía Épica&opcion=listadoCategoria"><i class="fa fa-github-alt fa-fw"></i> Fantasía Épica</a>
                        </li>
                        <li>
                            <a href="Servlet?columna=Romántica&opcion=listadoCategoria"><i class="fa fa-github-alt fa-fw"></i> Romántica</a>
                        </li>

                    </ul>
                </div>
            </div>
        </nav>
