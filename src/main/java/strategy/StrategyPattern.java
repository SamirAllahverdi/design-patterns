package strategy;

abstract class Fighter {
    KickBehavior kickBehavior;
    JumpBehavior jumpBehavior;

    public Fighter(KickBehavior kickBehavior, JumpBehavior jumpBehavior) {
        this.jumpBehavior = jumpBehavior;
        this.kickBehavior = kickBehavior;
    }

    public abstract void display();

    public void punch() {
        System.out.println("Default Punch");
    }

    public void kick() {
        kickBehavior.kick();
    }

    public void jump() {
        jumpBehavior.jump();
    }

    public void roll() {
        System.out.println("Default Roll");
    }

    public void setKickBehavior(KickBehavior kickBehavior) {
        this.kickBehavior = kickBehavior;
    }

    public void setJumpBehavior(JumpBehavior jumpBehavior) {
        this.jumpBehavior = jumpBehavior;
    }

}

interface KickBehavior {
    void kick();
}

class LightningKick implements KickBehavior {
    public void kick() {
        System.out.println("Lightning Kick");
    }
}

class TornadoKick implements KickBehavior {
    public void kick() {
        System.out.println("Tornado Kick");
    }
}

interface JumpBehavior {
    void jump();
}

class ShortJump implements JumpBehavior {
    public void jump() {
        System.out.println("Short Jump");
    }
}

class LongJump implements JumpBehavior {
    public void jump() {
        System.out.println("Long Jump");
    }
}

class Ryu extends Fighter {
    public Ryu(KickBehavior kickBehavior, JumpBehavior jumpBehavior) {
        super(kickBehavior, jumpBehavior);
    }

    public void display() {
        System.out.println("Ryu");
    }
}

class Ken extends Fighter {
    public Ken(KickBehavior kickBehavior, JumpBehavior jumpBehavior) {
        super(kickBehavior, jumpBehavior);
    }

    public void display() {
        System.out.println("Ken");
    }
}

class ChunLi extends Fighter {
    public ChunLi(KickBehavior kickBehavior, JumpBehavior jumpBehavior) {
        super(kickBehavior, jumpBehavior);
    }

    public void display() {
        System.out.println("ChunLi");
    }
}

class StrategyPattern {
    public static void main(String[] args) {

        JumpBehavior shortJump = new ShortJump();
        JumpBehavior LongJump = new LongJump();
        KickBehavior tornadoKick = new TornadoKick();


        Fighter ken = new Ken(tornadoKick, shortJump);
        ken.display();
        ken.punch();
        ken.kick();
        ken.jump();

        ken.setJumpBehavior(LongJump);
        ken.jump();
    }
}

