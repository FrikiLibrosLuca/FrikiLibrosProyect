<%@ include file ="menuAdmin.jsp" %>

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
              </ul>
           
           
           
 
  