<%@ include file ="menu.jsp" %>

    <div id="page-wrapper">
        <div class="row">
            <div class="col-lg-12">
                <header>
                    <h1 class="page-header">FrikiLibros</h1>
                </header>
              
                    <div class="panel panel-primary">
                        <header class="panel-heading tituloLibro">T�tulo del Libro </header>
                        <div class="row">
                            <div class="col-lg-10">
                                <div class="row">
                                    <div class="col-lg-6">
                                        <figure id="figureInfoLibro">
                                            <img id="imgInfoLibro" src="${libro.foto}" alt="${libro.titulo}">
                                        </figure>
                                    </div>

                                    <div class="col-lg-6 datosInfoLibro">
                                        <p class="plantillasLibro">T�tulo: <span>${libro.titulo}</span></p>
                                        <p class="plantillasLibro">ISBN: <span>${libro.isbn}</span></p>
                                        <p class="plantillasLibro">Autor: <span>${libro.autor.nombreAutor}</span></p>
                                        <p class="plantillasLibro">Saga: <span>${libro.saga}</span></p>
                                        <p class="plantillasLibro">Fecha de publicaci�n: <span>${libro.fechaEdicion}</span></p>
                                        <p class="plantillasLibro">Categor�a: <span>${libro.categoria}</span></p>
                                        <p class="plantillasLibro">Idioma: <span>${libro.idioma}</span></p>

                                    </div>

                                </div>

                            </div>
                        </div>
                    </div>
                


            </div>

        </div>

<%@ include file ="footer.html" %>
