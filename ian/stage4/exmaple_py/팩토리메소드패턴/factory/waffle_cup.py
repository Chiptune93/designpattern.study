from .cup import Cup


class WaffleCup(Cup):
    def make_ice_cream(self, ice_cream):
        cup = f"와플컵 {ice_cream().taste()}"
        print(cup)
        return cup
