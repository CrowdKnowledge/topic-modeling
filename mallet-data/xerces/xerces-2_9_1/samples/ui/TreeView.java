ui BorderLayout event event ActionListener event TextEvent event TextListener io BufferedReader io io io InputStream io InputStreamReader io UnsupportedEncodingException net MalformedURLException net BorderFactory JMenuBar JMenuItem JScrollPane JSplitPane JTextArea JTextField event TreeSelectionEvent event TreeSelectionListener tree DefaultTreeCellRenderer tree TreeNode tree TreeSelectionModel w3c dom Attr w3c dom w3c dom w3c dom Node xml sax ErrorHandler xml sax SAXException xml sax SAXParseException treeview actionlistener textlistener serialversionuid l debug default_parser_name warning error fatal_error title quitstring reloadstring expandstring collapsestring errorstorer ef fname domtree m_tree jtextarea sourcetext messagetext textline filenameinput fni domparsersaveencoding parser openfolder closedfolder leafimage treeview treeview uri uri openfolder defaultimages.createopenfolderimage closedfolder defaultimages.createclosedfolderimage leafimage defaultimages.createleafimage parser domparsersaveencoding ef errorstorer fname uri jmenubar jmb jmenubar filemenu jmenuitem item item jmenuitem filemenu.add item item.addactionlistener item jmenuitem quitstring filemenu.add item item.addactionlistener shortcutmenu item jmenuitem expandstring shortcutmenu.add item item.addactionlistener item jmenuitem collapsestring shortcutmenu.add item item.addactionlistener item jmenuitem reloadstring shortcutmenu.add item item.addactionlistener jmb.add filemenu jmb.add shortcutmenu setjmenubar jmb getcontentpane createui fname createui filename debug filename messagetext jtextarea messagetext.setfont font.plain messagepanel borderlayout messagepanel.add jscrollpane messagetext serialversionuid l getpreferredsize treeview.this.getsize size.width size.height getminimumsize borderlayout.center messagepanel.setborder borderfactory.createcompoundborder borderfactory.createtitledborder borderfactory.createemptyborder sourcetext jtextarea sourcetext.setfont font.plain sourcetext.setbackground color.white sourcetext.setforeground color.black sourcetext.setselectedtextcolor color.black sourcetext.setselectioncolor color.red sourcetext.seteditable sourcepanel borderlayout sourcepanel.add jscrollpane sourcetext serialversionuid l getpreferredsize treeview.this.getsize size.width getminimumsize borderlayout.center sourcepanel.setborder borderfactory.createcompoundborder borderfactory.createtitledborder borderfactory.createemptyborder treepanel borderlayout m_tree domtree m_tree.setcellrenderer xmltreecellrenderer m_tree.getselectionmodel setselectionmode treeselectionmodel.single_tree_selection m_tree.addtreeselectionlistener treeselectionlistener valuechanged treeselectionevent treenode node treenode e.getpath getlastpathcomponent nodeselected node m_tree.setrowheight m_tree.setfont font.plain treepanel.add jscrollpane m_tree serialversionuid l getpreferredsize treeview.this.getsize size.width getminimumsize borderlayout.center treepanel.setborder borderfactory.createcompoundborder borderfactory.createtitledborder borderfactory.createemptyborder refreshui filename split jsplitpane jsplitpane.horizontal_split treepanel sourcepanel mainsplitpane jsplitpane jsplitpane.vertical_split split messagepanel debug filename mainsplitpane refreshui filename debug filename messagetext.selectall messagetext.cut filename filename.equals messagetext.setforeground color.red messagetext.append filename fname filename newroot getroot filename newroot messagetext.setforeground color.red messagetext.append filename m_tree.setdocument newroot sourcetext.selectall sourcetext.cut readxmlfile fname sourcetext settitle title filename m_tree expandtree ef ef.geterrornodes ef.geterrornodes messagetext.setforeground color.red messagetext.append fname messagetext.append errors ef.geterrornodes keys errors.keys keys.hasmoreelements node node node keys.nextelement messagetext.append node.getnodename parseerror errors.get node getmsg debug filename getroot filename debug filename filename filename.equals ef.reseterrors parser.seterrorhandler ef parser.setfeature parser.setfeature parser.setfeature parser.parse filename document parser.getdocument document system.err.println readxmlfile filename jtextarea ta debug filename filename filename.equals inputstream fis bufferedreader dis java.net.url file createurl filename fis file.openstream javaencoding parser.getjavaencoding dis bufferedreader inputstreamreader fis javaencoding unsupportedencodingexception ex dis bufferedreader inputstreamreader fis ex system.err.println ex line len textline nl nllen nl.length stringbuffer sb stringbuffer readline line dis.readline sb.append line nl textline.addelement len len line.length nllen ta.append sb.tostring io system.err.println io debug filename nodeselected treenode treenode node node m_tree.getnode treenode node stringbuffer sb stringbuffer messagetext.selectall messagetext.cut errorobject ef ef.geterror node errorobject messagetext.setforeground color.red parseerror eip parseerror errorobject sb.append eip.getmsg lineno eip.getlineno pos sizeoftextline textline.size lineno sizeoftextline pos textline.elementat lineno-1 intvalue lineno sizeoftextline pos textline.elementat lineno intvalue pos textline.elementat sizeoftextline intvalue pos sourcetext.select pos messagetext.setforeground color.black sourcetext.select node.getnodetype node.element_node node.getnodetype node.text_node node.getnodetype node.cdata_section_node sb.append node.tostring messagetext.append sb.tostring textvaluechanged textevent fni fni.setvisible fname jtextfield e.getsource gettext debug fname refreshui fname ex system.err.println actionperformed java.awt.event.actionevent debug system.err.println e.getactioncommand e.getactioncommand quitstring e.getactioncommand fni filenameinput fni.addtextlistener fni.setvisible e.getactioncommand expandstring expandtree e.getactioncommand collapsestring rows m_tree.getrowcount rows m_tree.collapserow refreshui fname expandtree rows levels levels levels rows m_tree.getrowcount rows m_tree.expandrow xmltreecellrenderer defaulttreecellrenderer serialversionuid l gettreecellrenderercomponent tree selected expanded leaf row hasfocus node node domtree tree getnode comp super.gettreecellrenderercomponent tree selected expanded leaf row hasfocus selected comp.setbackground color.blue ef ef.geterrornodes node ef.geterrornodes containskey node comp.setforeground color.red node leaf leafimage expanded openfolder closedfolder node node txnode node attr txatt attr txnode.getattributenode txatt txatt.getvalue txatt.getvalue comp filenameinput actionlistener serialversionuid l filelabel jtextfield textfield ok cancel textlisteners filenameinput filenameinput title title filelabel textfield jtextfield textfield.addactionlistener ok cancel buttonpanel buttonpanel.add ok buttonpanel.add cancel ok.addactionlistener cancel.addactionlistener getcontentpane filelabel borderlayout.north getcontentpane textfield borderlayout.center getcontentpane buttonpanel borderlayout.south setsize actionperformed e.getsource ok e.getsource textfield textevent event textevent textfield textevent.text_value_changed deliverevent event setvisible e.getsource cancel setvisible addtextlistener textlistener listener listener textlisteners textlisteners textlisteners.addelement listener removetextlistener textlistener listener listener textlisteners textlisteners.removeelement listener deliverevent evt evt textevent textevent event textevent evt textlisteners textlisteners.clone textlistener l.elementat textvaluechanged event createurl name name malformedurlexception ex name getabsolutepath errorstorer errorhandler errornodes errorstorer geterrornodes errornodes node node errornodes errornodes.get node reseterrors errornodes errornodes.clear warning saxparseexception ex handleerror ex warning error saxparseexception ex handleerror ex error fatalerror saxparseexception ex saxexception handleerror ex fatal_error handleerror saxparseexception ex type ex.getmessage stringbuffer errorstring stringbuffer errorstring.append errorstring.append ex.getlinenumber errorstring.append errorstring.append ex.getmessage node node parser.getproperty saxexception exception system.err.println errornodes errornodes parseerror previous parseerror errornodes.get parseerror eip previous eip previous errorstring stringbuffer previous.getmsg errorstring.tostring eip.setmsg errorstring.tostring eip parseerror ex.getsystemid ex.getlinenumber ex.getcolumnnumber errorstring.tostring errornodes.put eip parseerror filename lineno charoffset key msg parseerror filename lineno charoffset key msg filename filename lineno lineno charoffset charoffset key key msg msg filename getlineno lineno getcharoffset charoffset key getmsg msg setmsg msg argv parsernameindex parsername default_parser_name argv.length arg argv arg.startswith arg.equals argv.length system.err.println parsername argv parsernameindex arg.equals printusage system.err.println arg frame parsernameindex argv.length-1 frame treeview frame treeview arg frame.addwindowlistener java.awt.event.windowadapter windowclosing java.awt.event.windowevent frame.setsize frame.setvisible printusage system.err.println system.err.println system.err.println system.err.println system.err.println default_parser_name system.err.println 