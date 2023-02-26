package com.example.yonkiflix

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.yonkiflix.databinding.ActivityVerBinding

class VerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityVerBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_ver)


        val video1 = intent.getStringExtra("video").toString()


        var video = ""
        when (video1) {
            "avatar" -> {
                binding.imagenserie.setImageResource(R.drawable.avatar1)
                video = "https://www.youtube.com/watch?v=5PSNL1qE6VY"
                binding.descripcion.text =
                    "Avatar es una película estadounidense de ciencia ficción y fantasía épica de 2009 dirigida, escrita, producida y coeditada por James Cameron. Está protagonizada por Sam Worthington, Zoe Saldana, Stephen Lang, Michelle Rodriguez, Sigourney Weaver y Giovanni Ribisi. Ambientada en el año 2154, la trama sigue a Jake Sully (Worthington), un exmarine parapléjico que se une a la expedición Pandora, una misión de investigación de la Corporación Resources Development Administration (RDA) para minar un valioso mineral en el planeta Pandora, habitado por los Na'vi, una raza de seres humanoides con una cultura avanzada."
            }
            "aqnhqv" -> {
                binding.imagenserie.setImageResource(R.drawable.aqnhqv)

                binding.descripcion.text =
                    "Aqui no hay quien viva es una serie de televisión española de comedia, creada por David Muñoz y producida por Globomedia para Telecinco. La serie se estrenó el 3 de septiembre de 2003 y finalizó el 30 de mayo de 2010, tras siete temporadas. La serie se centra en la vida de los habitantes de un edificio de viviendas de clase media-alta de Madrid, en el que se desarrollan las peripecias de sus habitantes, que se ven envueltos en situaciones cómicas y absurdas."
                video = "https://www.youtube.com/watch?v=rU93XqVOItw"
            }
            "ccavm" -> {
                binding.imagenserie.setImageResource(R.drawable.ccavm)
                binding.descripcion.text =
                    "Como conocí a vuestra madre es una serie de televisión estadounidense de comedia romántica creada por Carter Bays y Craig Thomas. La serie se estrenó el 19 de septiembre de 2005 en la cadena CBS y finalizó el 31 de marzo de 2014, tras nueve temporadas. La serie sigue la vida de Ted Mosby (Josh Radnor), quien comienza a contar a sus hijos cómo conoció a su madre, a través de flashbacks. La serie se centra en la vida de Ted, quien narra a sus hijos cómo conoció a su madre, a través de flashbacks. La serie se centra en la vida de Ted, quien narra a sus hijos cómo conoció a su madre, a través de flashbacks. La serie se centra en la vida de Ted, quien narra a sus hijos cómo conoció a su madre, a través de flashbacks. La serie se centra en la vida de Ted, quien narra a sus hijos cómo conoció a su madre, a través de flashbacks. La serie se centra en la vida de Ted, quien narra a sus hijos cómo conoció a su madre, a través de flashbacks. La serie se centra en la vida de Ted, quien narra a sus hijos cómo conoció a su madre, a través de flashbacks. La serie se centra en la vida de Ted, quien narra a sus hijos cómo conoció a su madre, a través de flashbacks. La serie se centra en la vida de Ted, quien narra a sus hijos cómo conoció a su madre, a través de flashbacks. La serie se centra en la vida de Ted, quien narra a sus hijos cómo conoció a su madre, a través de flashbacks. La serie se centra en la vida de Ted, quien narra a sus hijos cómo conoció a su madre, a través de flashbacks. La serie se centra en la vida de Ted, quien narra a sus hijos cómo conoció a su madre, a través de flashbacks. La serie se centra en la vida de Ted, quien narra a sus hijos cómo conoció a su madre, a través de flashbacks. La serie se centra en la vida de Ted, quien narra a sus hijos cómo conoció a su madre"
                video = "https://www.youtube.com/watch?v=BxJ9wBuQUFI"
            }
            "elpueblo" -> {
                binding.imagenserie.setImageResource(R.drawable.elpueblo)
                video = "https://www.youtube.com/watch?v=HocqGEWi4pE"
                binding.descripcion.text =
                    "\"El Pueblo\" es una serie de comedia española de Amazon Prime Video que sigue la vida de un grupo de británicos que deciden mudarse a un pequeño pueblo español en busca de una nueva vida. La serie se centra en las divertidas situaciones que surgen entre la comunidad local y los nuevos habitantes extranjeros."
            }
            "machosalfa" -> {
                binding.imagenserie.setImageResource(R.drawable.machosalfa)
                video = "https://www.youtube.com/watch?v=HocqGEWi4pE"
                binding.descripcion.text =
                    "Machos Alfa es una serie de televisión española de comedia creada por Javier Calvo y Javier Ambrossi. La serie se estrenó el 15 de septiembre de 2017 en Movistar+. La serie se centra en la vida de un grupo de amigos que se reúnen en un bar para hablar de sus problemas y de sus vidas."
            }
            "skyrojo" -> {
                binding.imagenserie.setImageResource(R.drawable.skyrojo)
                video = "https://www.youtube.com/watch?v=HocqGEWi4pE"
                binding.descripcion.text =
                    "\"Sky Rojo\" es una serie de acción española de Netflix que sigue a tres mujeres que huyen de su proxeneta y se enfrentan a una serie de peligros mientras intentan sobrevivir y escapar. La serie está llena de acción, violencia y un toque de humor negro."
            }
            "avatar2" -> {
                binding.imagenserie.setImageResource(R.drawable.avatar2)
                video = "https://www.youtube.com/watch?v=xKeJZ95Y3HA"
                binding.descripcion.text =
                    "\"Avatar 2\" es una película de ciencia ficción estadounidense de 2022 dirigida por James Cameron. La película es la secuela de la película de 2009 Avatar y la segunda entrega de la trilogía Avatar. La película sigue a Jake Sully (Sam Worthington), quien se une a la resistencia humana para luchar contra los Na'vi, una raza alienígena que vive en Pandora."
            }
            "chernobyl" -> {
                binding.imagenserie.setImageResource(R.drawable.chernobyl)
                video = "https://www.youtube.com/watch?v=s9APLXM9Ei8"
                binding.descripcion.text =
                    "\"Chernobyl\" es una serie de televisión de drama histórico estadounidense de HBO que se estrenó el 6 de mayo de 2019. La serie se centra en la catástrofe nuclear de Chernobyl de 1986 y en los esfuerzos de los trabajadores de la planta nuclear para contener la radiación y evitar una catástrofe mayor."
            }
            "coco" -> {
                binding.imagenserie.setImageResource(R.drawable.coco)
                video = "https://www.youtube.com/watch?v=yZ7cBunq8xo"
                binding.descripcion.text =
                    "\"Coco\" es una película de animación estadounidense de 2017 dirigida por Lee Unkrich, Adrian Molina y Jason Katzman. La película sigue a un niño llamado Miguel (Anthony Gonzalez) que viaja a la Tierra de los Muertos para encontrar a su abuelo, quien fue un famoso músico."
            }
            "emilyenparis" -> {
                binding.imagenserie.setImageResource(R.drawable.emilyenparis)
                video = "https://www.youtube.com/watch?v=wqbDkJmKf5I"
                binding.descripcion.text =
                    "\"Emily en París\" es una serie de comedia estadounidense de Netflix que sigue a Emily Cooper (Lily Collins), una joven ejecutiva de marketing de Chicago que se muda a París para trabajar en una agencia de publicidad. La serie se centra en las aventuras de Emily en la ciudad de la luz y en su vida amorosa."
            }
            "futurama" -> {
                binding.imagenserie.setImageResource(R.drawable.futurama)
                video = "https://www.youtube.com/watch?v=mj3OPJhGTgI"
                binding.descripcion.text =
                    "\"Futurama\" es una serie de animación estadounidense de comedia creada por Matt Groening para Fox. La serie se centra en Fry (Billy West), un repartidor de pizza del siglo XXI que se despierta accidentalmente 1.000 años en el futuro y se encuentra en un mundo lleno de robots, extraterrestres y otras criaturas."

            }
            "lossimpsons" -> {
                binding.imagenserie.setImageResource(R.drawable.lossimpsons1)
                video = "lossimpsons"
                binding.descripcion.text =
                    "\"Los Simpsons\" es una serie de animación estadounidense de comedia creada por Matt Groening para Fox. La serie se centra en la familia Simpson, una familia de clase media que vive en la ciudad de Springfield. La serie se centra en la vida de Homer Simpson (Dan Castellaneta), un trabajador de la planta nuclear de Springfield, y su familia."

            }
            "monstruossa" -> {
                binding.imagenserie.setImageResource(R.drawable.monstruos_sa)
                video = "monstruos"
                binding.descripcion.text =
                    "\"Monstruos, S.A.\" es una película de animación estadounidense de 2001 dirigida por Pete Docter y David Silverman. La película sigue a Mike Wazowski (Billy Crystal), un monstruo verde que trabaja en Monstruos, S.A., una empresa que fabrica gritos de niños para alimentar a los monstruos."
            }
            "lossimpsonspeli" -> {
                binding.imagenserie.setImageResource(R.drawable.lossimpsons_peli)
                video = "lossimpsonspeli"
                binding.descripcion.text =
                    "\"Los Simpsons: La película\" es una película de animación estadounidense de 2007 dirigida por David Silverman. La película sigue a la familia Simpson, que se va de vacaciones a Australia. Mientras están allí, Homer (Dan Castellaneta) se pierde en el bosque y es secuestrado por un grupo de extraterrestres."
            }
            "padredefamilia" -> {
                binding.imagenserie.setImageResource(R.drawable.padredefamilia)
                video = "padredefamilia"
                binding.descripcion.text =
                    "\"Padre de familia\" es una serie de animación estadounidense de comedia creada por Seth MacFarlane para Fox. La serie se centra en la familia Griffin, que vive en la ciudad de Quahog, Rhode Island. La serie se centra en Peter Griffin (MacFarlane), un padre de familia que trabaja en una fábrica de cerveza."
            }
            "pocahontas" -> {
                binding.imagenserie.setImageResource(R.drawable.pelis4)
                video = "https://www.youtube.com/watch?time_continue=11&v=t5dJIbQGyF8&embeds_euri=https%3A%2F%2Fwww.google.com%2Fsearch%3Fq%3Dpocahontas%2Btrailer%26biw%3D767%26bih%3D784%26tbm%3Dvid%26sxsrf%3DAJOqlzWxQDJMux_C0c4oc_-TEa9OFSn5Yg%253A1677416537&feature=emb_logo"
                binding.descripcion.text =
                    "\"Pocahontas\" es una película de animación estadounidense de 1995 dirigida por Mike Gabriel y Eric Goldberg. La película sigue a Pocahontas (Irene Bedard), una joven indígena que se enamora de John Smith (Mel Gibson), un explorador inglés."

            }
            "toysstoty1" -> {
                binding.imagenserie.setImageResource(R.drawable.toysstory1)
                video = "toysstoty1"
                binding.descripcion.text =
                    "\"Toy Story\" es una película de animación estadounidense de 1995 dirigida por John Lasseter. La película sigue a Woody (Tom Hanks), un vaquero de juguete, y a Buzz Lightyear (Tim Allen), un astronauta de juguete, que se hacen amigos. Cuando Andy (John Morris) se va a la universidad, Woody y Buzz se ven obligados a luchar contra el malvado Sid Phillips (Erik von Detten)."
            }

            "toystory11" -> {
                binding.imagenserie.setImageResource(R.drawable.toystory11)
                video = "toystory11"
                binding.descripcion.text =
                    "\"Toy Story 4\" es una película de animación estadounidense de 2019 dirigida por Josh Cooley. La película sigue a Woody (Tom Hanks), un vaquero de juguete, y a Buzz Lightyear (Tim Allen), un astronauta de juguete, que se hacen amigos. Cuando Andy (John Morris) se va a la universidad, Woody y Buzz se ven obligados a luchar contra el malvado Sid Phillips (Erik von Detten)."
            }
        }

        binding.cardView3.setOnClickListener {
            val intent = Intent(this, DescargarActivity::class.java)
            intent.putExtra("video", video)
            startActivity(intent)
        }

        binding.botonprincipalreproducir.setOnClickListener {
            val intent = Intent(this, ReproducirActivity::class.java)
            intent.putExtra("video", video)
            startActivity(intent)
        }

        binding.coincidencia.text = "Coincidencias : " + (0..100).random().toString() + "% |"
        binding.anyo.text = "" + (2000..2023).random().toString() + " | "
        binding.episodios.text = "Episodios : " + (1..100).random().toString()


    }


}