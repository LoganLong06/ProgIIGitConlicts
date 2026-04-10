[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/2LgVc-bd)
# Programming II (420-G20-HR)

# Assignment 1 – Enchanted Garden 🪴✨

Date assigned: Feb 6, 2026  
Due date: Feb 23, by EOD (11:59PM)

---

## Learning Objectives

Upon successful completion of this assignment, the student will be able to:
1. Understand and use inheritance & polymorphism
2. Create abstract classes & methods 
3. Write testable code 
4. Create UML Class diagrams with relationships

---

## Marking Scheme

| Component                                 | Mark |
|-------------------------------------------|------|
| UML Diagram                               | 5    |
| Models w/ proper hierarchy                | 20   |
| Garden implementation                     | 20   |
| GardenService                             | 15   |
| Unit tests                                | 25   |
| Git commit etiquette                      | 5    |
| Readability & coding conventions          | 10   |
| **Total**                                 | 100  |



## Setup & Submission
- [ ] READ THE ENTIRE ASSIGNMENT FIRST before starting (including the marking scheme above), so you understand ALL requirements and the breakdown of the assignment.
- [ ] Clone and use the provided starter project in this repository. All code must be committed and pushed here.
- [ ] Before starting, RUN the starter project first! See what I have given you and how you can use it to start off.
- [ ] Commit and PUSH up your changes often! There are marks for proper Git commit etiquette. If you are working in multiple places, `git pull` your changes before continuing.
- [ ] Kat will review your code and provide feedback & final marks via the Feedback Pull Request after the assignment deadline.

---

## Enchanted Garden 🪴✨

### Overview
Create a Java program called "Enchanted Garden", which models different magical plants in an enchanted garden.  
The program will track different types of plants, calculate how much they grow, and apply magical boosts to them.

### UML Diagram
 - In addition to your program, you must also create a UML Class Diagram, including relationships between classes. 
 - You do not need to show your Main class in the diagram, or your unit test classes.    
 - Create it in Visual Paradigm as practiced in class, then include a screenshot in this repository    

## Class requirements & functionality￼
You must follow the requirements below. You may add additional classes & methods to improve readability, maintainability, and testability if you wish.  
You must ONLY use concepts we have formally learned in class, anything else will result in a mark of 0, unless it has been approved by me.  

### Domain models￼
You will model an enchanted garden using inheritance, including multi-level inheritance! Follow the below requirements:  

`Plant` (abstract)￼
 - This is the base class for all plants in the garden  
 - Create private attributes AND public getters for: plant name, and # of days the plant has been in the garden 
 - Create a constructor that takes all attributes  
 - Create an instance method called `getInfo` that takes no parameters and returns a `String` with the plant's name and days planted formatted nicely   
 - Create an **abstract** instance method called `getDailyGrowth` that takes no parameters and returns a `double` representing how much this plant grows in one day (for example, in centimeters)  
 - Create an instance method called `applyMagicBoost` that takes no parameters, and returns a String that says "Some faint sparkles appear around <name>, but nothing else happens :( "  

`Herb`￼
 - This class represents simple magical herbs and must inherit all the behaviours and traits of `Plant`  
 - Create private attributes AND public getters for: hours of sunlight per day 
 - Create a constructor that takes all attributes
 - The implementation of `getDailyGrowth` performs the following calculation and returns it: dailyGrowth = (hoursOfSunlightPerDay * 0.5) + (daysPlanted * 0.1)  
 - The implementation of `applyMagicBoost` should increase sunlight by +2 hours

`Tree` (abstract)￼ 
 - This class represents larger plants and must extend `Plant`  
 - Create private attributes AND public getters for: age of the tree in years  
 - Create a constructor that takes all attributes
 - `Tree` does not implement `getDailyGrowth` directly and remains abstract

`FruitTree`￼ 
 - This class represents magical fruit trees and must inherit all behaviours and traits from `Tree`  
 - Create private attributes AND public getters for: current number of fruits, magic fertilizer level (double)  
 - Create a constructor that takes all attributes  
 - Create implementation of `getDailyGrowth` that uses this calculation to figure out how much the tree grows per day: dailyGrowth = (ageInYears * 0.2) + (fruitCount * 0.05) + (magicFertilizerLevel * 0.5)  
 - The implementation of `applyMagicBoost` should multiply fruitCount by 2  


### Garden
This class represents a collection of plants in the enchanted garden. You must include the following:  
- A private attribute: a `Plant[]` array  
- A constructor that takes an integer maximum size and creates a `Plant[]` of that length
- An instance method called `addPlant` that takes a `Plant` object as a parameter and returns a `boolean` (if there is room in the array, store the plant there and return `true`, otherwise return false if there is no room)
- An instance method called `getPlants` that takes no parameters, and returns an array (NOT the private attribute), which is filled with NO NULLS of all the plants currently in the garden.
- An instance method called `calculateTotalDailyGrowth` that takes no parameters and returns a `double` representing the total daily growth of all plants in the garden
- An instance method called `findFastestGrowingPlant` that takes no parameters and returns a `Plant` (if there are no plants in the garden, it may return `null`, otherwise, it returns the `Plant` with the highest `getDailyGrowth` value)  
- An instance method called `applyMagicToAll` that takes no parameters and returns nothing, but calls `applyMagicBoost` on each plant in the garden

### GardenService
All methods in this class MUST be static. This class will contain utility and calculation logic that operates on plants and the garden:  
- Create a static method called `createSampleGarden` that takes an integer maximum size and returns a `Garden` object which has already been pre-filled with multiple `Herb` and `FruitTree` objects  
- Create 2 static methods, BOTH called `calculateAverageDailyGrowth`, where one takes a `Garden` object as a parameter and returns a `double` representing the average daily growth of all plants in the garden (if there are no plants, you may return `0.0`), and one version that takes a `Plant[]` array as a parameter and returns a `double` representing the average daily growth of the plants in that array (IGNORING any `null` entries)  
- Create 2 static methods, BOTH called `applyMagicAndRecalculateGrowth`, where one takes a `Garden` object as a parameter, calls its `applyMagicToAll` method, and then returns the new total daily growth after magic has been applied, and one that takes a `Plant[]` array as a parameter, calls `applyMagicBoost` on each non-null plant in the array, and then returns the new total daily growth for that array  

You may add additional helper methods if you find them useful, but you MUST demonstrate all the above behaviour as a minimum.  

## Unit tests
The following must be unit tested, as following the standards in class: 
 - All domain models (Plant, Herb, Tree, FruitTree)
 - Garden
 - GardenService

You do not need to test Main, as it is not being graded and simply used as a sandbox.

## Technical requirements & tips
- You MUST only use approaches and code that we have covered in Programming I & II, otherwise a mark of 0 will be given. If you are unsure if you can use something, ask me.  
- Remember to modify your UML Diagram whenever you are refactoring any of your classes
- Practice iterative building
- Test as you go! Don't save the unit tests for the end, unless you want more work for yourself.  

Good luck!! 💫
