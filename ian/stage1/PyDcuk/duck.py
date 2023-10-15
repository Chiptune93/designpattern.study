import quack
import fly


class Duck(quack.CryingContext, fly.CryingContext):
    def __init__(self):
        super().__init__()
        print('나는 오리')


duck = Duck()
duck.sound_strategy = quack.Quack()
duck.fly_strategy = fly.Fly()
duck.cry()
duck.do()
