package oops.abstraction;

    public class Iphone extends SmartPhone{
        @Override
        public void makeCalls() {
            super.makeCalls();
        }

        @Override
        public void receiveCalls() {
            super.receiveCalls();
        }

        @Override
        public void leaveVoiceMails() {
            super.leaveVoiceMails();
        }

        @Override
        public void sendTextMessages() {
            System.out.print("Inherited from smartphone : ");
            super.sendTextMessages();
        }

        @Override
        public void playGames() {
            System.out.print("Inherited from smartphone : ");
            super.playGames();
        }

        @Override
        public void storeContacts() {
            System.out.print("Inherited from smartphone : ");
            super.storeContacts();
        }

        @Override
        public void playVideo() {
            System.out.println("You can play video suing iphone media player");

        }

        @Override
        public void playMusic() {
            System.out.println("You can play music from iTunes");
        }

        @Override
        public void makeVideoCalls() {
            System.out.println("You can make video calls using Facetime");
        }
    }

