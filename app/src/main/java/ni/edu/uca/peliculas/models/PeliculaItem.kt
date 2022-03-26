package ni.edu.uca.peliculas.models

data class PeliculaItem(
    val clasificacion: Int,
    val duracion: String,
    val idPelicula: Int,
    val idioma: Int,
    val nacionalidad: Int,
    val tipoMetraje: String,
    val titulo: String
)