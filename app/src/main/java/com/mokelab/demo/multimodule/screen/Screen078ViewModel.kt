package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data771RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data772RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data773RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data774RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data775RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data776RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data777RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data778RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data779RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data780RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen078ViewModel @Inject constructor(
    private val repo1: Data771RepositoryImpl,
    private val repo2: Data772RepositoryImpl,
    private val repo3: Data773RepositoryImpl,
    private val repo4: Data774RepositoryImpl,
    private val repo5: Data775RepositoryImpl,
    private val repo6: Data776RepositoryImpl,
    private val repo7: Data777RepositoryImpl,
    private val repo8: Data778RepositoryImpl,
    private val repo9: Data779RepositoryImpl,
    private val repo10: Data780RepositoryImpl,

): ViewModel() {
}
