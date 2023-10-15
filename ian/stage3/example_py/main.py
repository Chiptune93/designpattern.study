from beverage import Espresso,Milk

if __name__ == '__main__':
    espresso_milk = Milk(Espresso())
    print(espresso_milk.get_cost())
    print(espresso_milk.get_description())