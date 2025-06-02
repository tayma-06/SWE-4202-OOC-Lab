# Legends of Aetherfall - RPG Character Battle System

## 1. Introduction

Let’s imagine you are currently working on an RPG gaming project called **Legends of Aetherfall**. Your team members asked you to make the basic classes with their proper attributes. It is also your job to define the hierarchy between the classes.

## 2. Learning Objectives

- Design and implement base and derived classes.
- Apply inheritance and method overriding to model complex systems.
- Manage object state using attributes and encapsulated behaviors (methods).

## 3. Scenario

### 3.1 Legends of Aetherfall

**Year 7921AE**  
In the war-torn land of Aetherfall, once a cradle of harmony between nature, magic, and the mortal races, darkness stirs once more. The balance has shattered. The skies are veiled in ash, rivers run black with corruption, and the ancient forests whisper of forgotten evils returning.

The world teems with mystical creatures, but chaos reigns. Dwellers of Aetherfall live in fear, oppressed and hunted by forces of evil. Three main factions have risen to fight back:

- **Mages**: Scholars of the arcane.  
  - Lowest health, highest damage.
  - Can cast spells with the highest damage to any enemy.

- **Archers**: Swift and silent.  
  - Balanced health and damage.
  - Can shoot a single or multiple arrows. Multiple arrows cause double damage.

- **Warriors**: Resilient and fearless.  
  - Highest health.
  - Can shield themselves—but only if the enemy has less health.

### Enemy Types

- **Dark Overlord**: Once a wise mage, now corrupted.  
  - Causes high damage to both power and health.
  - Weakens the next 3 attacks.

- **Regional Warlords**: Powerful, corrupted leaders.  
  - Can stop opponent’s attacks temporarily.

- **Corrupted Mortals**: Mortals who chose darkness.  
  - Damage health only.

### 3.2 Game Mechanics Overview

All characters possess the following:

- **HealthLevel**: Character’s life.
- **PowerLevel**: Energy to attack.
- **Attack Mechanism**: Reduces opponent’s health.
- **Special Move**: Unique, high-damage attack.

#### 3.2.1 Gameplay Flow

1. User chooses a character (Mage, Archer, Warrior).
2. User names their character.
3. User chooses a villain (Dark Overlord, Regional Warlord, Corrupted Mortal).
4. Turn-based battle starts.
5. Battle ends when one character’s health reaches zero.

#### 3.2.2 Character Stats & Special Attacks

**Mage**
- Health: 80
- Power: 100
- Attack Damage: 20
- Attack Power Cost: 10
- Special: `castSpell()` – Power: 30, Damage: 40

**Archer**
- Health: 100
- Power: 100
- Attack Damage: 15
- Attack Power Cost: 8
- Special 1: `quickShot()` – Power: 25, Damage: 30  
- Special 2: `multiShot()` – Power: 50, Damage: 60

**Warrior**
- Health: 120
- Power: 100
- Attack Damage: 12
- Attack Power Cost: 5
- Special: `mightyStrike()` – Power: 35, Damage: 35

**Dark Overlord**
- Health: 200
- Power: 150
- Attack Damage: 25
- Attack Power Cost: 17
- Special: `summonDarkness()` – Power: 40, Damage: 50 + weakens next 3 attacks

**Regional Warlord**
- Health: 130
- Power: 110
- Attack Damage: 20
- Attack Power Cost: 10
- Special: `toxicAura()` – Power: 35, Damage: 30 + disables opponent attacks for 20s

**Corrupted Mortal**
- Health: 90
- Power: 90
- Attack Damage: 18
- Attack Power Cost: 9
- Special: `curse()` – Power: 20, Damage: 25

## 4. Tasks

- Implement all character classes with appropriate hierarchy.
- Add a unique ability for each character type.
- Implement a method to check if a character is alive.
- Display each character’s health and power after every action.
- Input/Output should follow the sample format provided.
