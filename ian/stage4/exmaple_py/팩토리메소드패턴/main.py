from product import NewYorkCheesecake
from factory import WaffleCone

if __name__ == '__main__':
    cup = WaffleCone()
    ice_cream = NewYorkCheesecake
    cup.make_ice_cream(ice_cream)
