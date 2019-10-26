package vickyrahma.rpl.superhero

class Menu {
    companion object {
        val menus: List<Any>
            get() = mutableListOf(
                "SUPERHERO",
                MenuItem("Spiderman", "Superhero Marvel", R.drawable.g_spiderman),
                MenuItem("Batman","Superhero Marvel",R.drawable.g_batman),
                MenuItem("Black Panther","Superhero Marvel",R.drawable.g_blackpanther),
                MenuItem("Wonder Woman","Superhero Marvel",R.drawable.g_wonderwoman),
                MenuItem("Incredibles","Superhero Disney",R.drawable.g_incredibles),
                MenuItem("Hulk","Superhero Marvel",R.drawable.g_hulk)
            )
    }
}