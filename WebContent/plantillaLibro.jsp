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
                                        <p class="plantillasLibro">Autor: <span>${libro.autor.nombreAutor}</span></p>
                                        <p class="plantillasLibro">Saga: <span>${libro.saga}</span></p>
                                        <p class="plantillasLibro">Fecha de publicación: <span>${libro.fechaEdicion}</span></p>
                                        <p class="plantillasLibro">Categoría: <span>${libro.categoria}</span></p>
                                        <p class="plantillasLibro">Idioma: <span>${libro.idioma}</span></p>

                                    </div>

                                </div>

                            </div>
                        </div>
                    </div>
                


            </div>

        </div>

<%@ include file ="footer.html" %>
