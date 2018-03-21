<%@ include file ="menuAdmin.jsp" %>

    <div id="page-wrapper">
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">FrikiLibros</h1>
            </div>
            <div class="panel panel-primary">
                <header class="panel-heading tituloLibro">Modificar Libro </header>
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
                                                        <label form="isbnLibro">ISBN</label>
                                                        <input class="form-control" id="disabledInput  isbnLibro" name="isbn" value="${libro.isbn}" type="text" disabled>

                                                    </div>
                                                    <div class="form-group">
                                                        <label for="modificarTitulo">Título</label>
                                                        <input class="form-control" name="titulo" id="modificarTitulo" value="${libro.titulo}">
                                                    </div>
                                                    <div class="form-group">
                                                        <label form="modificarFechaEdicion">Fecha de Edición</label>
                                                        <input type="date" class="form-control" id="fechaEdicionModificar" name="fecha" value="${libro.fecha}">
                                                    </div>
                                                    <div class="form-group">
                                                        <label for="modificarIdioma">Idioma</label>
                                                        <input class="form-control" name="idioma" id="modificarIdioma" value="${libro.idioma}">
                                                    </div>
                                                    <div class="form-group">
                                                        <label for="modificarAutor">Autor</label>
                                                        <select class="form-control">
                                                            <c:forEach var="autor" items="${listaAutor}">
                                                                <option name="autor" value="${autor}">${autor.name}</option>
                                                            </c:forEach>
                                                        </select>
                                                    </div>
                                                    <div class="form-group">
                                                        <label for="modificarCategoria">Categoría</label>
                                                        <select class="form-control">
                                                            <option name="categoria" value="terror">Terror</option>
                                                            <option name="categoria" value="thriller">Thriller</option>
                                                            <option name="categoria" value="dragones">Dragones</option>
                                                            <option name="categoria" value="cienciaFiccion">Ciencia Ficción</option>
                                                            <option name="categoria" value="fantasiaEpica">Fantasía Épica</option>
                                                            <option name="categoria" value="romantica">Romántica</option>
                                                        </select>
                                                    </div>
                                                    <button type="submit" class="btn btn-default">Submit Button</button>
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
