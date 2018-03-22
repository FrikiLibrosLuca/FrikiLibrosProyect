<%@ include file ="menuAdmin.jsp" %>


    <div id="page-wrapper">
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">FrikiLibros</h1>
            </div>
            <div class="panel panel-primary">
                <header class="panel-heading tituloLibro">Insertar Libro</header>
                <div class="row">
                    <div class="col-lg-10">
                        <div class="row">
                            <div class="col-lg-12">
                                <div class="panel panel-default">
                                    <div class="panel-body">
                                        <div class="row">
                                            <div class="col-lg-6">
                                                <form role="form" action="Servlet" method="GET">
                                                    <div class="form-group">
                                                        <label for="isbnLibro">ISBN</label>
                                                        <input class="form-control" name="ISBN" id="isbnLibro" value="000">
                                                    </div>
                                                    <div class="form-group">
                                                        <label for="modificarTitulo">Título</label>
                                                        <input class="form-control" name="titulo" id="modificarTitulo" placeholder="Pezcadilla">
                                                    </div>
                                                    <div class="form-group">
                                                        <label form="modificarFechaEdicion">Fecha de Edición</label>
                                                        <input type="date" class="form-control" name="fecha" id="fechaEdicionModificar">
                                                    </div>
                                                    <div class="form-group">
                                                        <label for="modificarIdioma">Idioma</label>
                                                        <input class="form-control" name="idioma" id="modificarIdioma" placeholder="InglÃƒÂ©s">
                                                    </div>
                                                    <div class="form-group">
                                                        <label for="modificarAutor">Autor</label>
                                                        <select class="form-control" name="autor">
                                                            <c:forEach var="autor" items="${listaAutor}">
                                                                <option value="${autor}">${autor.name}</option>
                                                            </c:forEach>
                                                        </select>
                                                    </div>
                                                    <div class="form-group">
                                                        <label for="modificarCategoria">Categoría</label>
                                                        <select class="form-control" name="categoria">
                                                            <option value="terror">Terror</option>
                                                            <option value="thriller">Thriller</option>
                                                            <option value="dragones">Dragones</option>
                                                            <option value="cienciaFiccion">Ciencia Ficción</option>
                                                            <option value="fantasiaEpica">Fantasía É‰pica</option>
                                                            <option value="romantica">Romántica</option>
                                                        </select>
                                                    </div>
                                                    <button type="submit" class="btn btn-default">Insertar</button>
                                                    <button type="reset" class="btn btn-default">Reset Button</button>
                                                    <input type="hidden" name="opcion" value="insertarLibro">
                                                </form>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

<%@ include file ="footer.html" %>
