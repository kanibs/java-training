package wizard.spells;        // (1)Package declaration
import wizard.pandorasBox.*;  // (2) Type-import-on-demand
import wizard.pandorasBox.artifacts.*;  // (3) Import from subpackage


public class Baldness extends Ailment {   // (4) Abbreviated name for Ailment
wizard.pandorasBox.LovePotion tlcOne;    // (5) Fully qualified name
LovePotion tlcTwo;						// (6) Class in same package
// ...
} 


class LovePotion { /* ... */ }