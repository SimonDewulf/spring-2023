package be.ordina.beandisambiguation;

import be.ordina.beandisambiguation.model.piece.Bishop;
import be.ordina.beandisambiguation.model.piece.King;
import be.ordina.beandisambiguation.model.piece.Piece;
import be.ordina.beandisambiguation.model.piece.Rook;

import java.util.List;

import static be.ordina.beandisambiguation.model.Color.BLACK;
import static be.ordina.beandisambiguation.model.Color.WHITE;


public class Config {

    List<Piece> whitePieces = List.of(new Rook(WHITE), new Bishop(WHITE), new King(WHITE));
    List<Piece> blackPieces = List.of(new Rook(BLACK), new Bishop(BLACK), new King(BLACK));

   /*
        todo:
          use these lists as beans in a service (test their contents)
          create a datasource structure like the last exercise from scratch but have the values differ in a "prod" and "dev" environment (test both values)
          create a service that pretends to call another application, override this bean in your test sources with a different implementation to have default test values

    */
}
