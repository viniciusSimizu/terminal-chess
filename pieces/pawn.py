from .piece import Piece


class Pawn(Piece):
    def __init__(self, color: str, symbol_unicode: str) -> None:
        super().__init__(color, symbol_unicode)
        