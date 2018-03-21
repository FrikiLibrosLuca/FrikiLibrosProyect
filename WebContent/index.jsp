<%@ include file ="menu.jsp" %>


    <div id="page-wrapper">
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">FrikiLibros</h1>
            </div>
            <section>
                <c:forEach var="libro" items="${listadoLibros}">
                    <section class="col-lg-3 col-md-4 col-sm-6 elementoLibro">
                        <figure>
                            <img src="${libro.foto}" />
                            <figcaption>
                                "${libro.titulo}"
                            </figcaption>
                        </figure>
                    </section>
                </c:forEach>
            </section>

        </div>
    </div>


<%@ include file ="footer.html" %>