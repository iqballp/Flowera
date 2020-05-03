package com.ehehe.flowera

object FlowerData {
    private val flowerNames = arrayOf("Anggrek",
        "Allamanda",
        "Anyelir",
        "Apel",
        "Asoka",
        "Aster",
        "Azalea",
        "Bakung",
        "Bangkai",
        "Begonia")

    private val flowerDetails = arrayOf("Anggrek yang bernama latin yaitu Orchidaceae, adalah salah satu jenis tanaman berbunga dengan anggota dan jenis paling banyak. Jenis-jenisnya pun sudah tersebar luas dari daerah tropika basah sampai wilayah sirkumpolar.",
        "Bunga Allamanda atau bisa disebut Allamanda cathartica adalah tanaman hias yang disebut juga sebagai bunga terompet emas atau bunga buttercup. Tumbuhan bunga ini termasuk dalam golongan perdu berkayu dengan tinggi yang dapat mencapai hingga 2 meter.",
        "Anyelir disebut juga sebagai bunga teluki, yang bernama ilmiah yaitu Dianthus caryophyllus merupakan tanaman hias pekarangan dan pot yang berasal dari wilayah Mediterania. Ada 2 macam tanaman anyelir diantaranya yaitu berjenis satu bunga untuk tiap tangkai dan jenis spray banyak bunga untuk tiap tangkai.",
        "Bunga apel biasa mekar pada musim semi, bertepatan dengan perkecambahan pada daun bunga tersebut. Maka bunga apel akan berwarna putih dan berbaur dengan warna pink yang berangsur memudar. Pada bunga apel ini, terdapat lima kelopak bunga yang bisa berdiameter mencapai 2.5 hingga 3.5 cm. Buah apel masak pada musim gugur, dan pada umumnya berdiameter 5 sampai 9 cm.",
        "Bunga asoka merupakan tumbuhan yang sering dipakai sebagai tanaman hias dan penghijauan di taman-taman. Di Indonesia, dikenal 2 macam bunga asoka ini, yaitu pohon asoka yang tumbuh menjulang tinggi tanpa ranting (Polyalthia Longifolia) dan bunga asoka biasa (Polyalthia sp.) yang mempunyai banyak ranting dan berdaun runcing.",
        "Sepintas bunga aster ini bentuknya hampir mirip dengan bunga matahari, tetapi bunga aster ini mempunyai daun bunga yang bersusun dengan banyak sekali warna mulai dari merah muda, putih, biru, ungu, juga warna lain di mana tengahnya pada umumnya berwarna kuning.",
        "Bunga Azalea adalah tanaman yang berbunga dari keluarga Ericaceae dan genus Rhododendron yang biasa tumbuh di daerah beriklim sedang. Bunga ini dikembangkan sebagai tanaman hias yang cukup populer. Warna bunga azalea juga beraneka macam mulai dari merah, kuning, putih, dan ungu.",
        "Bunga lily atau biasa dikenal dengan bunga bakung adalah bunga yang mempunyai bau yang sangat wangi. Bunga bakung yang besar itu mempunyai tiga daun bunga dengan berbagai warna dari mulai merah, putih, kuning, jingga, merah muda, ungu,sampai yang bintik-bintik kehitaman.",
        "Suweg raksasa (keribut) atau lebih dikenal sebagai bunga bangkai ini ialah tumbuhan yang asalnya dari talas-talasan. Bunga ini mengeluarkan bau yang kurang sedap seperti bangkai, yang sebetulnya bau ini untuk mengundang kumbang, lalat atau serangga lain untuk menyerbuki bunga tersebut.",
        "Bunga begonia adalah bunga yang merupakan genus dalam famili tumbuhan berbunga Begoniaceae. Nama genus sendiri, diciptakan oleh Charles Plumier, seorang botani yang berasal dari Perancis untuk menghormati Michel Begon, mantan gubernur koloni Perancis Haiti. Terdapat lebih dari 1.500 spesies, Bunga Begonia ini merupakan salah satu dari sepuluh genera angiosperma bunga yang paling besar.")

    private val flowerImages = intArrayOf(R.drawable.anggrek,
        R.drawable.allamanda,
        R.drawable.anyelir,
        R.drawable.apel,
        R.drawable.asoka,
        R.drawable.aster,
        R.drawable.azalea,
        R.drawable.bakung,
        R.drawable.bangkai,
        R.drawable.begonia)

    val listData: ArrayList<Flower>
        get() {
            val list = arrayListOf<Flower>()
            for (position in flowerNames.indices) {
                val flower = Flower()
                flower.name = flowerNames[position]
                flower.detail = flowerDetails[position]
                flower.photo = flowerImages[position]
                list.add(flower)
            }
            return list
        }
}