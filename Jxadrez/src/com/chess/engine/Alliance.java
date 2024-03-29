package com.chess.engine;

import com.chess.engine.player.BlackPlayer;
import com.chess.engine.player.Player;
import com.chess.engine.player.WhitePlayer;

public enum Alliance {
    WHITE {
        @Override
        public int getDirection() {
            return -1;
        }

        @Override
        public boolean isWhite() {
            return true;
        }

        @Override
        public Player choosePlayer(final WhitePlayer whitePlayer,final BlackPlayer blackPlayer) {
            return whitePlayer;
        }

        @Override
        public boolean isBlack() {
            return false;
        }
    },
    BLACK {
        @Override
        public int getDirection() {
            return 1;
        }

        @Override
        public boolean isWhite() {
            return false;
        }

        @Override
        public Player choosePlayer(final WhitePlayer whitePlayer,final BlackPlayer blackPlayer) {
            return blackPlayer;
        }

        @Override
        public boolean isBlack() {
            return true;
        }
    };


    public abstract int getDirection();

    public abstract boolean isBlack();

    public abstract boolean isWhite();

    public abstract Player choosePlayer(WhitePlayer whitePlayer, BlackPlayer blackPlayer);
}
