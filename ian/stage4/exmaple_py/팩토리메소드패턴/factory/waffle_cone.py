from .cup import Cup


class WaffleCone(Cup):
    def make_ice_cream(self, ice_cream):
        cup = f"와플콘 {ice_cream().taste()}"
        print(cup)
        return cup
