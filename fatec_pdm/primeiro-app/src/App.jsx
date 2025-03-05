const App = () => {
  const estilosBotao = {marginTop: 12, paddingBottom: 8, backgroundColor: 'blueviolet',
    borderRadius : 8, color: 'white', border: 'none', width:'100%', paddingTop: 8}
  const textoRotulo = 'Nome:'
  const obterTexto = () => {return 'Enviar'}
  const aoClicar = () => alert('Clicou')
  return (
    <div style={{width: 768, marigin: 'auto', backgroundColor: '#EEE',
    padding: 12, borderRadius: 8}}>
      <label className="rotulo" htmlFor="nome" style={{display:'block', marginBottom: 4}}>
      {textoRotulo}
      </label>
      <input type="text" id="nome" style={{paddingTop: 12, paddingBottom: 8,
        borderStyle: 'hidden', width: '100%', borderRadius: 8, outline: 'none'
      }}/>
      <button 
       onClick={aoClicar}
       style={estilosBotao}>
        {obterTexto()}
      </button>
    </div>
  )
}

export default App