package info.victorchu;

import info.victorchu.antlr4.AviatorLexer;
import info.victorchu.antlr4.AviatorParser;
import info.victorchu.boolexp.AbstractBooleanExpression;
import info.victorchu.simplification.BooleanMatrixSimplificator;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AviatorRuleParser {

    public Rule parseAviatorRule(String exp,String ruleName){
        // 1. parse rule
        Rule rule = parseExp(exp);
        rule.setName(ruleName);

        // 2. simplicity rule
        BooleanMatrixSimplificator booleanMatrixSimplificator =new BooleanMatrixSimplificator();
        rule.setBooleanMatrix(booleanMatrixSimplificator.handleBooleanExpression(rule.getBooleanExpression()));

        return rule;
    }

    public Rule parseExp(String exp){
        // parse aviator rule
        AviatorLexer lexer = new AviatorLexer(CharStreams.fromString(exp));
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        AviatorParser parser = new AviatorParser(commonTokenStream);
        ParseTree parseTree = parser.statement();

        BooleanExpVisitor booleanExpVisitor = new BooleanExpVisitor();
        return (Rule) parseTree.accept(booleanExpVisitor);
    }

    // this method is just for test
    public static void main(String[] args) throws IOException {
        AviatorRuleParser aviatorRuleParser = new AviatorRuleParser();
        String path =args[0]; // rule line-split file
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        String line;
        int count=0;
        List<Rule> rules = new ArrayList<>();
        while ((line = bufferedReader.readLine())!=null){
            Rule rule = aviatorRuleParser.parseAviatorRule(line,"test"+count);
            rules.add(rule);
        }

    }

}
