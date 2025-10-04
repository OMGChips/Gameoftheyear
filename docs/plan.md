# Plan för hur mitt spel ska byggas.
***
# Abstrakta klasser

- [x] Abstract Characters
  - [x] Adventurer
  - [x] Eventuellt Fiender
***
## Structure

- [ ] Karta
  - [ ] keys hålla koll vart spelaren varit
  - [ ] Uppdatera kartan
- [x] Characters
  - [x] Attack
  - [x] hp
  - [x] name
  - [x] damage
  - [x] isalive
  - [x] takeDamage
    - [x] Adventurer
      - [x] gainExperience
      - [x] levelup
      - [ ] move
      - [x] takeDamage
      - [ ] Weapon
    - [x] Monster
      - [x] xpReward
        - [x] Boss
          - [x] specialattack
- [x] Helper
- [x] info
  - [x] Regler
  - [x] Howto
- [x] Fällor
- [x] Menu
- [x] Olika rum att slumpa
***
## Interface

- [x] Helper
  - [x] Tid

***
### Info

Inte helt 100 på om allt är på rätt plats.
Fällor blir om man valt att gå fram med W så är det en av några saker som kan hända.
Finns tid så lägger jag till olika fällor. Hade varit coolt att få tidsbaserade där man kanske hinner reagera och "akta sig"
Ska nog bara ta skada av fällorna och sen kan man hitta kistor som ger hp/exp som kan göra att man lvlar upp.
Har inte helt fått in hur jag ska implementera någon rng mer än att den slumpar "rummen".
