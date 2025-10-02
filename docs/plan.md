# Plan för hur mitt spel ska byggas.
***
# Abstrakta klasser

- [ ] Abstract Characters
  - [ ] Adventurer
  - [ ] Eventuellt Fiender
***
## Structure

- [ ] Karta
  - [ ] keys hålla koll vart spelaren varit
  - [ ] Uppdatera kartan
- [ ] Characters
  - [ ] Attack
  - [x] hp
  - [x] name
  - [ ] damage
  - [ ] isalive
    - [ ] Adventurer
      - [x] gainExperience
      - [x] levelup
      - [ ] move
      - [x] takeDamage
    - [ ] Monster
      - [ ] xpReward
        - [ ] Boss
          - [ ] specialattack
- [ ] Helper
- [ ] info
  - [ ] Regler
  - [ ] Howto
- [ ] Fällor
- [ ] Menu
- [ ] Olika rum att slumpa
***
## Interface

- [ ] Helper
  - [ ] Tid

***
### Info

Inte helt 100 på om allt är på rätt plats.
Fällor blir om man valt att gå fram med W så är det en av några saker som kan hända.
Finns tid så lägger jag till olika fällor. Hade varit coolt att få tidsbaserade där man kanske hinner reagera och "akta sig"
Ska nog bara ta skada av fällorna och sen kan man hitta kistor som ger hp/exp som kan göra att man lvlar upp.
Har inte helt fått in hur jag ska implementera någon rng mer än att den slumpar "rummen".
