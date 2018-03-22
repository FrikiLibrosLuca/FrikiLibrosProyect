<%@ include file ="menu.jsp" %>


    <div id="page-wrapper">
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">FrikiLibros</h1>
                </div>
                <section class="col-lg-3 col-md-4 col-sm-6 elementoLibro">
            	<a href="Servlet?isbn=720&opcion=buscarLibro">
	            	<figure>
		                <img src="imagenes/720.jpg"/>
		                <figcaption>
		                   Apocalipsis Z
		                </figcaption>
	             	</figure>
             	</a>
             </section>
             <section class="col-lg-3 col-md-4 col-sm-6 elementoLibro">
            	<a href="Servlet?isbn=303&opcion=buscarLibro">
	            	<figure>
		                <img src="imagenes/303.jpg"/>
		                <figcaption>
		                   Fundación 
		                </figcaption>
	             	</figure>
             	</a>
             </section>
             <section class="col-lg-3 col-md-4 col-sm-6 elementoLibro">
            	<a href="Servlet?isbn=62&opcion=buscarLibro">
	            	<figure>
		                <img src="imagenes/62.jpg"/>
		                <figcaption>
		                   La maquina de los presagios
		                </figcaption>
	             	</figure>
             	</a>
             </section>
            </div>
        </div>


<%@ include file ="footer.html" %>