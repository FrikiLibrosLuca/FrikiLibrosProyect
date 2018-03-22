<%@ include file ="menuAdmin.jsp" %>


    <div id="page-wrapper">
        <div class="row">
            <div class="col-lg-12">
                <header>
                    <h1 class="page-header">FrikiLibros</h1>
                </header>
                <main>
                    <div class="panel panel-default">
                        <header class="panel-heading tituloLibro">Título del Libro </header>
                        <div class="row">
                            <div class="col-lg-10">
                                <div class="row">
                                    <div class="col-lg-6">
                                        <figure>
                                            <img src="#" alt="titulo del libro">
                                        </figure>
                                    </div>

                                    <div class="col-lg-6">
                                        <p class="plantillasLibro">Título: <span></span></p>
                                        <p class="plantillasLibro">ISBN: <span></span></p>
                                        <p class="plantillasLibro">Autor: <span></span></p>
                                        <p class="plantillasLibro">Saga: <span></span></p>
                                        <p class="plantillasLibro">Fecha de publicación: <span></span></p>
                                        <p class="plantillasLibro">Categoría: <span></span></p>
                                        <p class="plantillasLibro">Idioma: <span></span></p>
                                        <p align="right">
                                            <button type="button" class="btn btn-danger" class="botonEliminar">Eliminar</button>
                                        </p>


                                    </div>

                                </div>

                            </div>
                        </div>
                    </div>
                </main>
            </div>
        </div>
    </div>


<%@ include file ="footer.html" %>