package org.example.rooms;

import org.example.utils.Helper;

public class RoomRandomizer {

    private static Helper helper = new Helper();

    public static Room randomRoom() {
        Room[] rooms = new Room[]{
                new EmptyRoom(),
                new TrapRoom(),
                new MonsterRoom(),
                new TreasureRoom()
        };

        int index = helper.randomInt(0, rooms.length - 1);
        return rooms[index];
    }
}
