
package content;
import arc.graphics.Color;
import mindustry.type.Item;

public class ModItem {
    public static Item
            Carbonizedsteel ;
        public static void load() {
            Carbonizedsteel = new Item("Carbonizedsteel", Color.valueOf("4A4D4E")) {{
                hardness = 1;
                cost = 0.5f;
                alwaysUnlocked = true;
            }};
        }