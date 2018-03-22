<%@ include file ="menuAdmin.jsp" %>

    <div id="page-wrapper">
        <div class="row">
            <div class="col-lg-12">
                <header>
                    <h1 class="page-header">FrikiLibros</h1>
                </header>

                <div class="panel panel-default">
                    <header class="panel-heading tituloLibro">Título del Libro </header>
                    <div class="row">
                        <div class="col-lg-12">
                            <div class="panel panel-default">
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
                                                    <td>${libro.isbn}</td>
                                                    <td>${libro.titulo}</td>
                                                    <td>${libro.stock}</td>
                                                </tr>
                                            </c:forEach>
                                        </tbody>
                                    </table>
                                </div>

                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <%@ include file ="footer.html" %>
