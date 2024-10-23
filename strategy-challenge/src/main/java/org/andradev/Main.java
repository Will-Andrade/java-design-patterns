package org.andradev;

import org.andradev.charactersRoster.Character;
import org.andradev.charactersRoster.*;
import org.andradev.behaviors.*;

/**
 * @implNote
 * Head First Design Patterns Challenge: Strategy Design Puzzle
 *
 * @author
 * Willian Andrade
 *
 * @implSpec
 * 1. Arrange the classes;
 * 2. Identify one abstract class, one interface and eight classes;
 * 3. Name every relationship.
 *  - Use: -> for "extends".
 *  - Use ...> for "implements".
 *  - Use => for HAS-A.
 * 4. Put the setWeapon() method in the right class.
 */

public class Main {
	public static void main(String[] args) {

		Character troll = new Troll();
		
		troll.setWeapon(new AxeBehavior());
		troll.fight();
		troll.attack();
		
		System.out.println("--------------------------------------");
		
		Character king = new King();
		king.setWeapon(new BowAndArrowBehavior());
		king.fight();
		king.attack();
	
		System.out.println("--------------------------------------");
		
		Character queen = new Queen();
		queen.setWeapon(new KnifeBehavior());
		queen.fight();
		queen.attack();

		System.out.println("--------------------------------------");
		
		Character knight = new Knight();
		knight.setWeapon(new SwordBehavior());
		knight.fight();
		knight.attack();
	}
}