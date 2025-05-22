// // Forma sincrona 
// const somaDemorada = (n) => {
//     let ac = 0
//     for(let i = 1; i <= 1; i++)
//         ac += i
//     return ac
// }
// const res = somaDemorada(10)
// console.log(res)

// // Forma assincrona 
// const somaDemoradaASC = (n) => {
//     const p = new Promise((resolve, reject) => {
//         if(n >= 1) {let ac}
//         else {reject('Some valores positivos')}

//         let ac = 0

//         for(let i = 1; i <= n; i++) ac += i

//         resolve(ac)
//     })
//     return p 
// }

// const res = somaDemoradaASC(10)

// // then
// res
// .then((soma) => console.log(`Soma: ${soma}`))
// .catch((err) => console.log(`Erro: ${err}`))

// console.log('Realizando outras coisas...')

//async/await
// async function fatorial(n){
//     let ac = 1

//     for (let i = 2; i <= n; i++) 
//         ac *= i
    
//     return ac
// }

async function fatorial(n){
    return new Promise((resolve, reject) => {
        if(n>=1){
        let ac = 1
        for(let i = 2; i <= n; i++)
            ac *= i
        resolve(ac)
        } else reject('Somente Positivos')
    })
}

const chamadaComAsyncAeait = async () => {
    try{
        const f1 = await fatorial(5)
        console.log(f1)
    }catch(err) {
        console.log(err)
    }
    try{
        const f2 = await fatorial(-5)
        console.log(f2)
    }catch(err) {
        console.log(err)
    }
}
chamadaComAsyncAeait()
console.log('Outras coisas')