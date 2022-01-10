import java.util.Scanner;

public class CYOA
{
    public static void main(String[]args)
    {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("You wake up in a dark hallway. You have no idea how you got here but you have a bad feeling about this. You walk forward down the hall and come to a split in the hallway. you can either turn left or right. For left press 1 for right press 2");
            int turn = input.nextInt();

            if(turn==1)
            {
                System.out.println("You turn left, wondering if you had made the correct choice. You soon realise that this hall is a lot more damp than the last. You see a trapdoor under your feet, but supass it to see where the hall ends up. At the end of the hall there is a door. You can either go through the trapdoor or the big door. Press 1 to go through the trapdoor or press 2 to go through the big door");
                int doorChoice = input.nextInt();

                if(doorChoice == 1)
                {
                    System.out.println("You open the trapdoor and end up in the basement of the house. It is very dark but you can make out a figure in the corner of the room. The figure turns around as soon as you make a sound. It starts to screach and then it kills you. YOU LOSE");
                }

                if(doorChoice==2)
                {
                    System.out.println("You go through the door and realise the source of the water that was making the hallway damp is in this room, you turn on a light and see an overflowing bathtub in the corner of the room. There is a figure in the tub. It has gills and fins. You investigate more and realize there is a creature from the black lagoon infront of you. You try to get out and realise the door is locked, You are dragged into the tub by the creature and are drowned.YOU LOSE");
                }
            }

            if(turn==2)
            {
                System.out.println("You turn right, and almost automatically feel the temputature syrocketing. You continue to walk forward until you find a door with a bright, orange light coming from the cracks. Beside this door is a window. To go through the window press 1 to go through the door press 2");
                int windowChoice = input.nextInt();

                if(windowChoice==1)
                {
                    System.out.println("You escape out the window and enter the courtyard. You see a gate to the garden and a forest up ahead. to try to escape through the forest press 1 to enter the garden press 2");
                    int outsideChoice = input.nextInt();

                    if(outsideChoice==1)
                    {
                        System.out.println("You walk into the forest and get the odd fleeing you are being followed. You begin to run and you find a nearby town. you have successfully escaped. YOU WIN");
                    }

                    if(outsideChoice==2)
                    {
                        System.out.println("You enter the garden and begin to investagate and trip onto s pair of hedgetrimmers, impaling yourself. YOU LOSE");
                    }
                }

                if(windowChoice==2)
                {
                    System.out.println("You open the door and see the source of both the light and the heat. There is a furnace in the corner of the room that makes the room a comfortable warm. You realize there is a sleeping bag near the furnace, you decide to sleep, you wake up and realize that there is a new door where the door you entered into once was. You are free. YOU WIN");
                }
            }
        }
    }
}