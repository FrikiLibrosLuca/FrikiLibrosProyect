<%@ include file ="menu.jsp" %>

    <div id="page-wrapper">
        <div class="row">
            <div class="col-lg-12">
                <header>
                    <h1 class="page-header">FrikiLibros</h1>
                </header>
              
                    <div class="panel panel-primary">
                        <header class="panel-heading tituloLibro">Título del Libro </header>
                        <div class="row">
                            <div class="col-lg-10">
                                <div class="row">
                                    <div class="col-lg-6">
                                        <figure id="figureInfoLibro">
                                            <img id="imgInfoLibro" src="${libro.foto}" alt="${libro.titulo}">
                                        </figure>
                                    </div>

                                    <div class="col-lg-6 datosInfoLibro">
                                        <p class="plantillasLibro">Título: <span>${libro.titulo}</span></p>
                                        <p class="plantillasLibro">ISBN: <span>${libro.isbn}</span></p>
                                        <p class="plantillasLibro">Autor: <span>${libro.autor.apellidoAutor}</span>,  <span>${libro.autor.nombreAutor}</span></p>
                                        <p class="plantillasLibro">Saga: <span>${libro.saga}</span></p>
                                        <p class="plantillasLibro">Fecha de publicación: <span>${libro.fechaEdicion}</span></p>
                                        <p class="plantillasLibro">Categoría: <span>${libro.categoria}</span></p>
                                        <p class="plantillasLibro">Idioma: <span>${libro.idioma}</span></p>

                                    </div>

                                </div>

                            </div>
                            <div class="col-lg-2">
                            	<c:if test="${privilegio}">
					            	<a href="<c:url value='Servlet?opcion=eliminarLibro&isbn=${libro.isbn}'/>">
										<p align="right">
										<button type="button" class="btn btn-danger" class="botonEliminar">Eliminar</button>
										</p>
									</a>
					            	<!--<jsp:include page="botonModificar.jsp"/>-->
					            	<a href="<c:url value='Servlet?opcion=insertarLibro&isbn=${libro.isbn}'/>">
										<p align="right">
											<button type="button" class="btn btn-primary" class="botonModificar">Modificar</button>
										</p>
									</a>
					            </c:if>
                            </div>
                        </div>
                    </div>
                


            </div>

        </div>

<%@ include file ="footer.html" %>
